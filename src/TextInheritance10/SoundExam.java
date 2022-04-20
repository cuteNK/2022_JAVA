package TextInheritance10;

public class SoundExam {

	public static void main(String[] args) {
		Sound radio = new Radio();	// UpCasting과 같은 현상
		// radio는 Radio클래스에 있는 재정의 된 메소드에 접근 가능
		
		Sound tv = new TV();	// UpCasting과 같은 현상
		// tv는 TV클래스에 있는 재정의 된 메소드에 접근 가능
		
		radio.SoundUp(5);
		tv.SoundUp(5);
	}

}
