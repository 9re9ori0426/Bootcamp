import java.util.Objects;

public class Student{
	private String name;
	private int age;
	private int kor;
	private int eng;
	private int jp;
	
	public Student(String name, int age, int kor, int eng, int jp) {
		super();
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.jp = jp;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getKor() {
		return kor;
	}



	public void setKor(int kor) {
		this.kor = kor;
	}



	public int getEng() {
		return eng;
	}



	public void setEng(int eng) {
		this.eng = eng;
	}



	public int getJp() {
		return jp;
	}



	public void setJp(int jp) {
		this.jp = jp;
	}

	public double getAvg() {
		return (kor+eng+jp)/(double)3;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return name.equals(((Student)obj).getName());
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", kor=" + kor + ", eng=" + eng + ", jp=" + jp + ", avg=" + (kor+eng+jp)/3.0 + "]";
	}
}