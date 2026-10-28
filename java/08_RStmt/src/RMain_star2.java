import java.util.Arrays;

public class RMain_star2 {
	
	public static void printArr(String[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]);				
			}
			System.out.println();
		}
	}

	public static String[][] rec(int n, int x, int y, String[][] map, int xLen, int yLen) {
		System.out.printf("rec %d : x %d, y %d, xlen %d ylen %d\n", n, x, y, xLen, yLen);
		if(n == 0) {
			map[y][x] = "*";
			
			map[y+1][x-1] = "*";
			map[y+1][x+1] = "*";
			
			map[y+2][x-2] = "*";
			map[y+2][x-1] = "*";
			map[y+2][x] = "*";
			map[y+2][x+1] = "*";
			map[y+2][x+2] = "*";
			
			printArr(map);
			
			return map;
		}
		else {
			int _xLen = (xLen-1)/2;
			int _yLen = (yLen-1)/2;
			map[y][x] = "*";
			
			map[y+1][x-1] = "*";
			map[y+1][x+1] = "*";
			
			map[y+2][x-2] = "*";
			map[y+2][x-1] = "*";
			map[y+2][x] = "*";
			map[y+2][x+1] = "*";
			map[y+2][x+2] = "*";
			
			String[][] _map = rec(n-1, x-(_xLen)/2, y+_yLen, map, _xLen, _yLen);
			_map = rec(n-1, x+(_xLen)/2, y+_yLen, _map, _xLen, _yLen);
			return _map;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		int NUM = 3;
		
		String[][] map = new String[NUM*2+1][NUM*4+1];
		for(int i = 0; i < map.length; i++) {
			Arrays.fill(map[i], " ");
		}
		
		map = rec(NUM-1, (map[0].length-1)/2, 0, map, map[0].length, map.length);
		
		printArr(map);
	}
}
