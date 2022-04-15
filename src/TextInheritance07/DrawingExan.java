package TextInheritance07;

public class DrawingExan {
	public static void main(String[] args) {
		Circle c= new Circle();
		c.draw();	// Circle클래스에 있는 draw()호출
		c.painting();	// Circle클래스에 있는 painting()호출
		Shape s = new Shape();
		s.draw();	// Shape클래스에 있는 draw()호출
		// s.painting();	// 에러
		s = c;	// Upcasting
		s.draw();	// Circle클래스에 있는 draw()메소드가 호출
		// s.painting(); 에서 painting()메소드는 재 정의한 메소드가 아니기 때문에
		// 접근이 불가능
	}
}
