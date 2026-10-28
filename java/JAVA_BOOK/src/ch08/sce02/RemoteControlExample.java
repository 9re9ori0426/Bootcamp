package ch08.sce02;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		RemoteControl rc;
		
		System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최소 볼륨 : " + RemoteControl.MIN_VOLUME);

		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
	
		RemoteControl.changeBattery();
	}
}
