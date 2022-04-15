package TextInheritance08;

public class ShipMainExam {
	public static void main(String[] args) {
		Ship myship = new MyShip();	// UpCasting
		Ship yourship = new YourShip();	// UpCasting
		ShipName.search(myship); // ShipName클래스에 있는 search()메소드 호출
		// 인자값으로 myship이 전달
		ShipName.search(yourship);
		// 2. ShipName클래스에 있는 search()메소드 호출
		// 인자값으로 yourship이 전달

	}

}
