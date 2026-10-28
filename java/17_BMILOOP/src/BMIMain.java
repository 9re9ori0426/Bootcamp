
public class BMIMain {
	public static void main(String[] args) {
		
		Doctor doctor = new Doctor();
		
		Guest guest = new Guest();
		
		doctor.askInfo();
		
		guest.answer();
		
		doctor.checkUp(guest);
	}
}
