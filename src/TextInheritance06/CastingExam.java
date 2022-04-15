package TextInheritance06;

public class CastingExam {

	public static void main(String[] args) {
		// ��ü ����
		Car mycar, yourcar;
		Bus mybus, yourbus;
		Truck mytruck, yourtruck;
		
		// ��ü ����
		mycar = new Car();
		mybus = new Bus();
		mytruck = new Truck();
		
		// CarŬ������ print() ȣ��
		System.out.println("[" + mycar.print() + "]");
		// BusŬ������ print() ȣ��
		System.out.println("[" + mybus.print() + "]");
		// TruckŬ������ print() ȣ��
		System.out.println("[" + mytruck.print() + "]");
		
		// UpCasting
		yourcar = mybus;
		System.out.println("[" + yourcar.print() + "]");
		
		// DownCasting
		yourbus = (Bus)yourcar;	// yourbus ��ü ����
		System.out.println("[" + yourbus.print() + "]");
		
		// yourcar.print()�� yourcar�� TruckŬ������ ����ȯ �߱� ������
		// TruckŬ������ �ִ� �������̵��� print()�޼ҵ� ȣ��
		yourcar = mytruck;	// UpCasting�߻�
		System.out.println("[" + yourcar.print() + "]");
		
		// yourtruck�� TruckŬ������ ��ü ����
		// yourtruck.print()�� TruckŬ������ �ִ� print()�޼ҵ� ȣ��
		yourtruck = (Truck)yourcar;	// DownCasting
		System.out.println("[" + mytruck.print() + "]");

	}

}
