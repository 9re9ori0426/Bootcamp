import java.io.*;
import java.net.*;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class WMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("city : ");
		
		String API_KEY = "";
		
		String city = sc.nextLine();
		city = URLEncoder.encode(city);
		String url = String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&units=metric&appid=%s", city, API_KEY);
		
		try {
			URL u = new URL(url);
			HttpsURLConnection conn = (HttpsURLConnection) u.openConnection();
			InputStream stream = conn.getInputStream();
			InputStreamReader r = new InputStreamReader(stream, "utf-8");


			JSONObject jsonData = (JSONObject) new JSONParser().parse(r);
			
			JSONArray weatherArr = (JSONArray) jsonData.get("weather");
			System.out.println( "이름 : " + jsonData.get("name") );
			System.out.println( "국가 : " + ((JSONObject)jsonData.get("sys")).get("country") );
			System.out.println( "날씨 : " + ((JSONObject)weatherArr.getFirst()).get("main") );
			System.out.println( "설명 : " + ((JSONObject)weatherArr.getFirst()).get("description"));
			System.out.println( "온도 : " + ((JSONObject)jsonData.get("main")).get("temp") );
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
