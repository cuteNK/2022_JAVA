package TextInheritance10;

public class Radio implements Sound {
	// Sound 인터페이스에 있는 추상메소드를 반드시 구현
	private int SndLevel;
	public Radio() {
		SndLevel = 0;
	}
	
	public void SoundUp(int level) {
		SndLevel += level;
		System.out.println(level + "Radio 볼륨 증가");
	}
	
	public void SoundDown(int level) {
		SndLevel -= level;
		if (SndLevel < 0) {
			SndLevel = 0;
		}
	}
	
}
