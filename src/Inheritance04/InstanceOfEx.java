package Inheritance04;

public class InstanceOfEx {
   static void print(Person p) {
      if (p instanceof Person)
         System.out.println("Person");
      if(p instanceof Student)
         System.out.println("Student");
      if (p instanceof Researcher)
         System.out.println("Researcher");
      if (p instanceof Professor)
         System.out.println("Professor");
      System.out.println();
   }
   
   public static void main(String[] args) {
      System.out.print("new Student() ->\t"); print(new Student());
      System.out.print("new Researcher() ->\t"); print(new Researcher());
      System.out.print("new Professor() ->\t"); print(new Professor());
   }
}