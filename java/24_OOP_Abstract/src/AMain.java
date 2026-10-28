
public class AMain {
	public static void main(String[] args) {

		Hero sm = new SuperMan();
		sm.name = "헨리카빌";
		Hero im = new IronMan();
		im.name = "로다주";
		Hero h = new Hulk();
		h.name = "마크러팔로";
		
		sm.attack();
		sm.fly();
		im.attack();
		im.fly();
		h.attack();
		h.fly();
	}
}
