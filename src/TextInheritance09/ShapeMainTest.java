package TextInheritance09;

public class ShapeMainTest {

	public static void main(String[] args) {
		ShapeCalculator s = new ShapeCalculator();
		System.out.println("원의 면적은 " + s.getArea(10));
		System.out.println("원의 둘레는 " + s.getCircum(10));

	}

}
