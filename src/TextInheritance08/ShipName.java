package TextInheritance08;

public class ShipName {
   public static void search(Ship s) {
	   // 1. Ship s = myship�� ����
      if(s instanceof MyShip) {	// True
         MyShip b = (MyShip) s;	// DownCasting
         System.out.println("MyShip name : " + b.name());
         // b.Name()�� MyShipŬ������ �ִ� Name()�޼ҵ� ȣ��
      }
      else if(s instanceof YourShip) {
         YourShip b = (YourShip) s;
         System.out.println("YourShip name : " + b.name());
         
      }
   }

}