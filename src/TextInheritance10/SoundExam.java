package TextInheritance10;

public class SoundExam {

	public static void main(String[] args) {
		Sound radio = new Radio();	// UpCasting�� ���� ����
		// radio�� RadioŬ������ �ִ� ������ �� �޼ҵ忡 ���� ����
		
		Sound tv = new TV();	// UpCasting�� ���� ����
		// tv�� TVŬ������ �ִ� ������ �� �޼ҵ忡 ���� ����
		
		radio.SoundUp(5);
		tv.SoundUp(5);
	}

}
