package TextInheritance05;

public class MainTruckExam {

	public static void main(String[] args) {
		Truck myTruck = new Truck();
		// 오버라이딩이 되었지만 Truck클래스에 있는 speedUp()메소드를 호출
		myTruck.speedUp();
		
		// Car클래스에 있는 speedDown()메소드를 호출
		// 오버라이딩이 안되었기 때문
		myTruck.speedDown();

	}

}
