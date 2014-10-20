package Chap14;

public class SkinnableRobotTester {
	static void intro(Pet p){
		p.introduce();
	}
	
	public static void main(String[] args){
		Pet[] a = {
				new Pet("Kurt", "�A�C"),
				new RobotPet("R2D2", "���[�N"),
				new SkinnableRobotPet("OSX5", "Apple", Skinnable.LEOPARD),
				new Pet("�}�C�P��", "�p�Y"),
		};
		
		for (Pet p : a){
			intro(p);
			
			if(p instanceof SkinnableRobotPet){
				System.out.print("�X�L����");
				((SkinnableRobotPet)p).printSkin();
				System.out.println("�ł��B");
			}
			System.out.println();
		}
	}

}
