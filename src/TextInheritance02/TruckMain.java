package TextInheritance02;

class Truckmain {
	public static void main(String[] args) {
		Truck mytruck = new Truck();
		mytruck.carname = "����Ƽ��";
		mytruck.ton = 3;
		mytruck.velocity = 100;
		System.out.println("���� Ʈ���� " + mytruck.color + "�̴�.");
		System.out.println(mytruck.carname + "�� " + mytruck.ton + "���� ���� �� �ִ�");
		mytruck.speedUp();
		System.out.println("Ʈ���� �ӵ��� " + mytruck.velocity + "�̴�.");
		mytruck.speedDown();
		System.out.println("Ʈ���� �ӵ��� " + mytruck.velocity + "�̴�.");
	}
}