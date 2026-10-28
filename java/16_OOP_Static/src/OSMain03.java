
public class OSMain03 {
	public static void main(String[] args) {
		// 삼성
	
		Galaxy s1 = new Galaxy("갤럭시 플립4", 110);
		Galaxy s2 = new Galaxy("갤럭시 플립5", 150);
		Galaxy s3 = new Galaxy("갤럭시북 5", 20);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("총 생산 개수 : " + Galaxy.COUNT);
	}
}
