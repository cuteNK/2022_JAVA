package TextInheritance09;

public class ShapeCalculator extends ShapeExam {
	// ShapeExam에서 추상메소드로 선언
	@Override
	public double getArea(int a) {	// 재정의 필수
		return 3.14 * a * a;	// 원의 면적
	}
	
	@Override
	public double getCircum(int a) {	// 재정의 필수
		return 2 * 3.14 * a;	// 원의 둘레
	}
}