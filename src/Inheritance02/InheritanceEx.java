package Inheritance02;

public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		s.setWeight(100);
		System.out.println(s.age + s.name + s.height + s.getWeight());

	}

}
