package TextInheritance05;

public class Truck extends Car{
   int ton;
   
   void speedUp() {
      velocity += 10;
      System.out.println("�ӵ�" + velocity + "����");
   }
}