package TextInheritance03;

public class Student {
	// 멤버 변수
	String name;
	String hakbun;
	String phone;
	String josu;
	String major;
	
	// 생성자
	public Student() {}
	public Student(String name, String hakbun) {
		this.name = name;
		this.hakbun = hakbun;
	}
	
	public void study(){ System.out.println("공부하다."); }
	public void eat(){ System.out.println("식사하다."); }
	public void test(){ System.out.println("시험보다."); }
	public void extra_act(){ System.out.println("동아리 활동하다."); }
}
