

public class NMain {
	public static void main(String[] args) {
		
		Player player = new Player();
		Enemy enemy = new Enemy();
		Judge judge = new Judge(); 
		
		judge.play(player, enemy);
		
	}
}
