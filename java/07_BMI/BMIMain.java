import java.util.Scanner;

public class BMIMain {
	public static void main(String[] args) throws InterruptedException {
		// BMI (체질량 지수 구하는 프로그램)
		Scanner sc = new Scanner(System.in);
		
		// 1. 필요한 값 (키, 체중, 이름)
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		if (height > 3) {			
			height *= 0.01;
		}
		System.out.print("체중 : ");
		double weight = sc.nextDouble();
		
		System.out.print("계산중");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".\n");
		
		// 2. 계산식
		// 체중 / (키 * 키) - 단위 : kg, m
		double bmi = weight / (height * height);
		
		// 3. 판정
		String state = "저체중";
		if (bmi >= 35) {
			state = "3단계 비만";
		}
		else if (bmi >= 30) {
			state = "2단계 비만";
		}
		else if (bmi >= 25) {
			state = "단계 비만";
		}
		else if (bmi >= 23) {
			state = "비만 전 단계";
		}
		else if (bmi >= 18.5) {
			state = "비만 전 단계";
		}
		
		// 4. 결과출력 - 소수점 1~2자리까지만
		// BMI 지수 : 00.00
		// ㅇㅇ님, 당신은 ㅇㅇ 입니다.
		System.out.printf("BMI 지수 : %.2f\n", bmi);
		System.out.printf("%s님, 당신은 %s입니다\n", name, state);
		
		System.out.println("종료하려면 아무 키나 입력 해주세요");
		sc.next();
	}
}
