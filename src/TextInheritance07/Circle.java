package TextInheritance07;

public class Circle extends Shape{
      private String type = "원";
      
      public void draw() { // 재정의 Overriding
         System.out.println(type + "그리기");
      }
      public void painting() { // 
         System.out.println("색칠하기");
      }
}