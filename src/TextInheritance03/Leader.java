package TextInheritance03;

public class Leader extends Student {
	boolean boss;
	
	// ������ �ۼ�
	public Leader (String name, String hakbun, boolean boss) {
		super(name, hakbun);	// ���� Ŭ������ �Ű����� 2���� ���� ������ ȣ��
		this.boss = boss;
	}
	
	void isLeader() {
		if(boss)
			System.out.println(name + "�� ����");
		else
			System.out.println(name + "�� ����ƴ�");
	}
	
	
	
}
