package Chap14;

public class RobotPet extends Pet {
	
	public RobotPet(String name, String masterName){
		super(name, masterName);
	}
	
	public void introduce(){
		System.out.println("�����̓��{�b�g�B ���O��" + getName() + "�B");
		System.out.println("������l�l��" + getMasterName() + "�B");
	}
	
	public void work(int sw){
		switch (sw){
		case 0: System.out.println("�|�����܂��B"); break;
		case 1: System.out.println("���󂵂܂��B"); break;
		case 2: System.out.println("�������܂��B"); break;
		}
	}

}
