package TextInheritance09;

public class ShapeCalculator extends ShapeExam {
	// ShapeExam���� �߻�޼ҵ�� ����
	@Override
	public double getArea(int a) {	// ������ �ʼ�
		return 3.14 * a * a;	// ���� ����
	}
	
	@Override
	public double getCircum(int a) {	// ������ �ʼ�
		return 2 * 3.14 * a;	// ���� �ѷ�
	}
}