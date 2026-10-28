import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NMain {
	public static String CLIENT_ID = "v0rc750ser";
	public static String SECRET = "YizqEDDWnypkP87lAfbQCwu9IXCPNViOwsntjTQl";

	public static void main(String[] args) {

		try {
			System.out.print("검색어를 입력하세요 : ");
			Scanner sc = new Scanner(System.in);

			String keyword = URLEncoder.encode(sc.nextLine(), "utf-8");
			String url = "https://naverapihub.apigw.ntruss.com/search/v1/webkr?query=" + keyword + "&display=10";

			Map<String, String> requestHeaders = new HashMap<>();
			requestHeaders.put("X-NCP-APIGW-API-KEY-ID", CLIENT_ID);
			requestHeaders.put("X-NCP-APIGW-API-KEY", SECRET);

			String responseBody = get(url, requestHeaders);
			
			JSONParser jp = new JSONParser();
			JSONObject data = (JSONObject) jp.parse(responseBody);
			
			JSONArray items = (JSONArray) data.get("items");
			for (int i = 0; i < items.size(); i++) {
				JSONObject o = (JSONObject) items.get(i);
				System.out.println("-".repeat(30));
				System.out.println("제목 : " + o.get("title") );
				System.out.println("설명 : " + o.get("description") );
			}
			
		} catch (Exception e) {

		}
	}

	private static String get(String apiUrl, Map<String, String> requestHeaders) {
		HttpURLConnection con = connect(apiUrl);
		try {
			con.setRequestMethod("GET");
			for (Map.Entry<String, String> header : requestHeaders.entrySet()) {
				con.setRequestProperty(header.getKey(), header.getValue());
			}

			int responseCode = con.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 응답
				return readBody(con.getInputStream());
			} else { // 에러 응답
				return readBody(con.getErrorStream());
			}
		} catch (IOException e) {
			throw new RuntimeException("API 요청과 응답 실패", e);
		} finally {
			con.disconnect();
		}
	}

	private static HttpURLConnection connect(String apiUrl) {
		try {
			URL url = new URL(apiUrl);
			return (HttpURLConnection) url.openConnection();
		} catch (MalformedURLException e) {
			throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
		} catch (IOException e) {
			throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
		}
	}

	private static String readBody(InputStream body) {
		InputStreamReader streamReader = new InputStreamReader(body, StandardCharsets.UTF_8);
		try (BufferedReader lineReader = new BufferedReader(streamReader)) {
			StringBuilder responseBody = new StringBuilder();
			String line;
			while ((line = lineReader.readLine()) != null) {
				responseBody.append(line);
			}
			return responseBody.toString();
		} catch (IOException e) {
			throw new RuntimeException("API 응답을 읽는데 실패했습니다.", e);
		}
	}
}
