
public class UMain {
	
	public static void main(String[] args) {
		String s = "안녕";
		System.out.println(s);
		
		String s2 = "안녕";
		System.out.println(s2);
		
		System.out.println("\"안녕\" == \"안녕\"\t\t\t:" + (s == s2) );
		System.out.println("\"안녕\" equals \"안녕\"\t\t:" + (s.equals(s2)) );
		
		String s3 = new String("안녕");
		System.out.println("\"안녕\" == new String(\"안녕\")\t:" + (s == s3) );
		s3 = "안녕";
		System.out.println("\"안녕\" == \"안녕\"\t\t\t:" + (s == s3) );
		
		System.out.println("----------------");
		
		String ss = "이제 이십분만..";
		System.out.println(ss.charAt(1));
		System.out.println(ss.indexOf("만"));
		System.out.println(ss.contains("이제 이"));
		
		System.out.println( ss.endsWith(".") ? ".으로 끝남" : ".으로 끝나지 않음");
		System.out.println( ss.endsWith("요") ? "요로 끝남" : "요로 끝나지 않음");
		System.out.println( ss.startsWith("이") ? "이로 시작함" : "이로 시작하지 않음");
		System.out.println( ss.startsWith("두") ? "두로 시작함" : "두로 시작하지 않음");
		
		ss = ss.replace("이십분만", "네시간만");
		System.out.println(ss);
		
		System.out.println(ss.substring(1, 5));

		String [] arr = ss.split("시");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String ss1 = "졸";
		ss1+="린";
		System.out.println(ss1);
		System.out.println(ss1.concat(ss1));
		
		StringBuffer sb = new StringBuffer();
		String s22 = "조";
		sb.append(s22);
		sb.append("금");
		sb.append("만");
		sb.append("힘");
		sb.append("내");
		sb.append("요");
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("금");
		sb2.append("만");
		sb2.append("힘");
		sb2.append("내");
		sb2.append("요");
		System.out.println(sb2);
		
	}
}
