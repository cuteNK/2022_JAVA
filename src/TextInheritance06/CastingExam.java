package TextInheritance06;

public class CastingExam {

	public static void main(String[] args) {
		// 객체 선언
		Car mycar, yourcar;
		Bus mybus, yourbus;
		Truck mytruck, yourtruck;
		
		// 객체 생성
		mycar = new Car();
		mybus = new Bus();
		mytruck = new Truck();
		
		// Car클래스의 print() 호출
		System.out.println("[" + mycar.print() + "]");
		// Bus클래스의 print() 호출
		System.out.println("[" + mybus.print() + "]");
		// Truck클래스의 print() 호출
		System.out.println("[" + mytruck.print() + "]");
		
		// UpCasting
		yourcar = mybus;
		System.out.println("[" + yourcar.print() + "]");
		
		// DownCasting
		yourbus = (Bus)yourcar;	// yourbus 객체 생성
		System.out.println("[" + yourbus.print() + "]");
		
		// yourcar.print()는 yourcar가 Truck클래스로 형변환 했기 때문에
		// Truck클래스에 있는 오버라이딩된 print()메소드 호출
		yourcar = mytruck;	// UpCasting발생
		System.out.println("[" + yourcar.print() + "]");
		
		// yourtruck는 Truck클래스의 객체 생성
		// yourtruck.print()는 Truck클래스에 있는 print()메소드 호출
		yourtruck = (Truck)yourcar;	// DownCasting
		System.out.println("[" + mytruck.print() + "]");

	}

}
