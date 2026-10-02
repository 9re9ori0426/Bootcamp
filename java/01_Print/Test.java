
public class Test {
	// test
	
	// 콘솔에 다음을 출력하세요.
	
	// @ 가능하면 : 콜론 (:) 이랑 * 정렬까지.
	
	// ***************
	// * 이름	  : dw   *
	// * 나이  : 20   *
	// * 사는곳 : 종로  *
	// ***************
	
	// JVM이 main을 찾아서 실행
	public static void main(String[] args) {
		// \t : 띄어쓰기 여러번 X	다음의 구역
		// \n : 줄바꿈
		System.out.print("*****************\n");
		System.out.println("* 이름	: dw\t*");
		System.out.println("* 나이	: 27\t*");
		System.out.println("* 사는곳	: 남양주\t*");
		System.out.println("*****************");
		
		// System.out : 표준 출력 공간
		// System.in  : 표준 입력 공간
		
		// println	: 출력 후 줄 바꿈
		// print	: 출력 (줄 안 바꿈)
		// printf	: 출력 형식 잡을 때
		
		// Test2
		// 위에 내용 syso 한줄로.
		
		System.out.println("*****************\n* 이름	: dw\t*\n* 나이	: 27\t*\n"
				+ "* 사는곳	: 남양주\t*\n*****************");
	}
}
