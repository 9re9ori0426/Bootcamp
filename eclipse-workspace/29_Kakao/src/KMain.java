import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class KMain {

	public static String API_KEY = "4d2211a39b3e15119b3d290e44b036ff";
	
	//	Authorization: KakaoAK ${REST_API_KEY}
	
	public static void main(String[] args) {
		
		try {
			System.out.print("검색어를 입력하세요 : ");
			Scanner sc = new Scanner(System.in);
			
			String keyword = URLEncoder.encode(sc.nextLine());
			String url = "https://dapi.kakao.com/v3/search/book?query="+keyword;
			
			URL u = new URL(url);
			HttpsURLConnection conn = (HttpsURLConnection)u.openConnection();
			conn.addRequestProperty("Authorization", "KakaoAK 4d2211a39b3e15119b3d290e44b036ff");
			
			InputStream is = conn.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8"); 
			
			JSONParser jp = new JSONParser();
			JSONObject data = (JSONObject) jp.parse(isr);
			
			JSONArray documents = (JSONArray) data.get("documents");
			
			for (int i = 0; i < documents.size(); i++) {
				JSONObject o = (JSONObject) documents.get(i);
				System.out.println("-".repeat(30));
				System.out.println("제목 : " + o.get("title"));
				System.out.println("출판사 : " + o.get("publisher"));
				System.out.println("가격 : " + o.get("price"));
				System.out.println("저자 : " + o.get("authors"));
				System.out.println("상태 : " + o.get("status"));
			}
			
//			System.out.println(data);
		}
		catch (Exception e) {
			
		}
	}
}
