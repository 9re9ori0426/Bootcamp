
public class OLMain {

	public static void main(String[] args) {
		// 계산기
		Calc.add(1, 2);
		Calc.add(1, 2, 3);
		Calc.add(1.1, 2.2);
		Calc.add(1.1, 2.2, 3.3);
		Calc.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		//곱
		Calc.gob_free(1, 2, 3.5, 4.5);
		Calc.gob_free(1, 2, 3, 4, 5);
	}
}
