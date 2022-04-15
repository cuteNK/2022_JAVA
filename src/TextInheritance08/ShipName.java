package TextInheritance08;

public class ShipName {
   public static void search(Ship s) {
	   // 1. Ship s = myship와 같다
      if(s instanceof MyShip) {	// True
         MyShip b = (MyShip) s;	// DownCasting
         System.out.println("MyShip name : " + b.name());
         // b.Name()는 MyShip클래스에 있는 Name()메소드 호출
      }
      else if(s instanceof YourShip) {
         YourShip b = (YourShip) s;
         System.out.println("YourShip name : " + b.name());
         
      }
   }

}