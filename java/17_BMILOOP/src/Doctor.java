
public class Doctor {
	
	public static double getBmi(Guest guest) {
		return guest.getWeight() / Math.pow(guest.getHeight(), 2);
	}

	public static String getGrade(double bmi) {
		if( bmi < 18.5) {
			return "저체중";
		}
		else if(bmi < 23) {
			return "정상";
		}
		else if(bmi < 25) {
			return "비만전단계";
		}
		else if(bmi < 30) {
			return "1단계 비만";
		}
		else if(bmi < 35) {
			return "2단계 비만";
		}
		else {
			return "3단계 비만";
		}
	}
	
	public static double getGoalWeight(Guest guest, double bmi) {
		double goalWeight = 0;
		if( bmi < 18.5) {
			goalWeight = 18.5*Math.pow(guest.getHeight(), 2);
		}
		else if( bmi >= 23) {
			goalWeight = 23*Math.pow(guest.getHeight(), 2);
		}
		return goalWeight;
	}
	
	public void askInfo() {
		System.out.println("키, 체중, 이름을 말해주세요");
	}
	
	public void checkUp(Guest guest) {
		try {
			double _bmi = getBmi(guest);
			String _grade = getGrade(_bmi);
			
			System.out.print("잠시만요.");
			Thread.sleep(200);
			System.out.print(".");
			Thread.sleep(200);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".\n");
	
			System.out.printf("BMI 지수 : %.2f\n", _bmi);
			System.out.printf("%s님, 당신은 %s입니다.\n", guest.getName(), _grade);
			
			double _goalWeight = getGoalWeight(guest, _bmi);
			String msg = "목표 정상체중 구간(%.2fkg)까지 앞으로 %.2fkg %s이 필요합니다.";
			if(_goalWeight != 0) {
				System.out.printf(msg, _goalWeight, Math.abs(guest.getWeight()-_goalWeight), guest.getWeight()-_goalWeight > 0 ? "감량" : "증량");
			}
			
		}
		catch(Exception e) {
			
		}
	}
	
}
