import java.util.Iterator;

public class AMain05 {
	public static void main(String[] args) {
		// 2차원 배열
		int[][] students = { {180, 80}, {170, 70}, {160, 60} };
		
		for (int i = 0; i < students.length; i++) {
			System.out.printf("%d번째 학생의 키 : %d\n", i+1, students[i][0]);
			System.out.printf("%d번째 학생의 체중 : %d\n", i+1, students[i][1]);
		}
		System.out.println("-".repeat(50));
		
		//이름, 사는 곳
		String[][] ss = {{"mz1", "서울"}, {"mz2", "부산"}, {"mz3", "울산"}};
		
		for (int i = 0; i < ss.length; i++) {
			System.out.printf("%d번째 학생의 이름 : %s\n", i+1, ss[i][0]);
			System.out.printf("%d번째 학생의 사는 곳 : %s\n", i+1, ss[i][1]);
		}
		System.out.println("-".repeat(50));
		
		int[][] arr = new int[3][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = i*arr[i].length+j+1;
//				System.out.printf("%d\t", arr[i][j]);				
			}
//			System.out.println();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("-".repeat(50));
		
		int[][][] aaa =  { 
			{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }, 
			{ {10, 11, 12}, {13, 14, 15}, {16, 17, 18} }, 
			{ {19, 20, 21}, {22, 23, 24}, {25, 26, 27} }
		};
		
		//10
		System.out.printf("%d aaa[1][0][0]\n", aaa[1][0][0]);
		//4
		System.out.printf("%d aaa[0][1][0]\n", aaa[0][1][0]);
		//17
		System.out.printf("%d aaa[1][2][1]\n", aaa[1][2][1]);
		//23
		System.out.printf("%d aaa[2][1][1]\n", aaa[2][1][1]);

		System.out.println("-".repeat(100));
		for (int i = 0; i < aaa.length; i++) {
			for (int j = 0; j < aaa[0].length; j++) {
				for (int k = 0; k < aaa[0][0].length; k++) {
					System.out.printf("aaa[%d][%d][%d] = %d\t", i, j, k, aaa[i][j][k] );
				}
				System.out.println();
			}
			System.out.println("-".repeat(100));
		}
		
		int[][][][] aaa4 = {
			{ 
				{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }, 
				{ {10, 11, 12}, {13, 14, 15}, {16, 17, 18} }, 
				{ {19, 20, 21}, {22, 23, 24}, {25, 26, 27} }
			},
			{ 
				{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }, 
				{ {10, 11, 12}, {13, 14, 15}, {16, 17, 18} }, 
				{ {19, 20, 21}, {22, 23, 24}, {25, 26, 27} }
			},
			{ 
				{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }, 
				{ {10, 11, 12}, {13, 14, 15}, {16, 17, 18} }, 
				{ {19, 20, 21}, {22, 23, 24}, {25, 26, 27} }
			}
		};
		
		System.out.println("-".repeat(100));
		for (int i = 0; i < aaa4.length; i++) {
			for (int j = 0; j < aaa4[0].length; j++) {
				for (int k = 0; k < aaa4[0][0].length; k++) {
					for (int l = 0; l < aaa4[0][0][0].length; l++) {
						System.out.printf("aaa[%d][%d][%d][%d] = %d\t", i, j, k, l, aaa4[i][j][k][l] );
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println("-".repeat(100));
		}
		
		
		
		
	}
}
