package TextInheritance08;

public class ShipMainExam {
	public static void main(String[] args) {
		Ship myship = new MyShip();	// UpCasting
		Ship yourship = new YourShip();	// UpCasting
		ShipName.search(myship); // ShipNameŬ������ �ִ� search()�޼ҵ� ȣ��
		// ���ڰ����� myship�� ����
		ShipName.search(yourship);
		// 2. ShipNameŬ������ �ִ� search()�޼ҵ� ȣ��
		// ���ڰ����� yourship�� ����

	}

}
