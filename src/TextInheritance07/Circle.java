package TextInheritance07;

public class Circle extends Shape{
      private String type = "��";
      
      public void draw() { // ������ Overriding
         System.out.println(type + "�׸���");
      }
      public void painting() { // 
         System.out.println("��ĥ�ϱ�");
      }
}