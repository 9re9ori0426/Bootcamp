
public class SMain {
	public static void main(String[] args) {
		
		Me me = Me.getMe();
		Me me2 = Me.getMe();
		
		System.out.println(me.toString());
		System.out.println(me2.toString());
		
		System.out.println(me.hashCode());
		System.out.println(me2.hashCode());
		
		System.out.println(IronMan.IRONMAN.getName());;
	}
}
