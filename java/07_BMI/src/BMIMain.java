import java.util.Scanner;

public class BMIMain {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		// 체질량 키(kg) / (체중*체중(m))
		
		// 1. 필요한 값		키, 체중, 이름
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("키(cm/m) : ");
		double height = sc.nextDouble();
		if( height > 3 ) {
			height /= 100;
		}
		
		System.out.print("체중(kg) : ");
		double weight = sc.nextDouble();
		
		// 2. 계산식	
		// 키(kg) / (체중*체중(m))
		double bmi = weight / Math.pow(height, 2);
		
		// 3. 판정 (범위)
		String grade = "";
		
		if( bmi < 18.5) {
			grade = "저체중";
		}
		else if(bmi < 23) {
			grade = "정상";
		}
		else if(bmi < 25) {
			grade = "비만전단계";
		}
		else if(bmi < 30) {
			grade = "1단계 비만";
		}
		else if(bmi < 35) {
			grade = "2단계 비만";
		}
		else {
			grade = "3단계 비만";
		}
		
		System.out.print("계산중.");
		Thread.sleep(200);
		System.out.print(".");
		Thread.sleep(200);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".\n");
		
		// 4. 결과 출력 (지수 소수점 1~2자리, 단계)
		// BMI 지수 : 22.22
		// OO님, 당신은 OO입니다.
		System.out.printf("BMI 지수 : %.2f\n", bmi);
		System.out.printf("%s님, 당신은 %s입니다.\n", name, grade);
		
		double goalWeight = 0;
		if( bmi < 18.5) {
			goalWeight = 18.5*Math.pow(height, 2);
		}
		else if( bmi >= 23) {
			goalWeight = 23*Math.pow(height, 2);
		}

		String msg = "목표 정상체중 구간(%.2fkg)까지 앞으로 %.2fkg %s이 필요합니다.";
		if(goalWeight != 0) {
			System.out.printf(msg, goalWeight, Math.abs(weight-goalWeight), weight-goalWeight > 0 ? "감량" : "증량");
		}
	
		System.out.println("종료하려면 아무키를 누른뒤 엔터를 입력해주세요");
		sc.next();
		
	}
}
