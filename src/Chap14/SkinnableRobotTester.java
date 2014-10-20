package Chap14;

public class SkinnableRobotTester {
	static void intro(Pet p){
		p.introduce();
	}
	
	public static void main(String[] args){
		Pet[] a = {
				new Pet("Kurt", "アイ"),
				new RobotPet("R2D2", "ルーク"),
				new SkinnableRobotPet("OSX5", "Apple", Skinnable.LEOPARD),
				new Pet("マイケル", "英雄"),
		};
		
		for (Pet p : a){
			intro(p);
			
			if(p instanceof SkinnableRobotPet){
				System.out.print("スキンは");
				((SkinnableRobotPet)p).printSkin();
				System.out.println("です。");
			}
			System.out.println();
		}
	}

}
