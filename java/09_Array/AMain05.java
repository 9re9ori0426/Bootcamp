
public class AMain05 {
	public static void main(String[] args) {
		// 2차원 배열

		// 학생들의 키, 체중 (여러명 만들거임)

		// int[행][열]

		int stud[][] = { { 180, 80 }, { 170, 70 }, { 160, 60 } };

		// 첫번쨰 학생의 키
		System.out.println(stud[0][0]);

		// 세번째 학생의 체중
		System.out.println(stud[2][1]);

		// 두번째 학생의 키
		System.out.println(stud[1][0]);

		// 이름, 사는곳

		String[][] ss = { { "mz1", "서울" }, { "mz2", "부산" }, { "mz33", "울산" } };

		// 두번째 사람의 사는곳
		System.out.println(ss[1][1]);

		// 첫번째 사람의 이름
		System.out.println(ss[0][0]);

		// 세번째 사람의 이름과 사는 곳
		System.out.println(ss[2][0] + " / " + ss[2][1]);

		int[][] ar = new int[3][4];

		int num = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				ar[i][j] = num++;
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		// 3차원 배열
		// [면][행][열]

		int[][][] aaa = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, 
				{ { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } },
				{ { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 } } };
		
		// 10
		System.out.println(aaa[1][0][0]);
		// 4
		System.out.println(aaa[0][1][0]);
		// 17
		System.out.println(aaa[1][2][1]);
		// 23
		System.out.println(aaa[2][1][1]);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.print(aaa[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
