package Chap08;

public class HumanTester {
	public static void main(String[] args){
		Human suzuki = new Human();
		Human takada = new Human();
		
		suzuki.name = "��ؓ�Y";
		suzuki.height = 170;
		suzuki.weight = 60;
		
		takada.name = "���c����";
		takada.height = 166;
		takada.weight = 72;
		
		System.out.println("���O :" + suzuki.name);
		System.out.println("�g�� :" + suzuki.height + "cm");
		System.out.println("�̏d :" + suzuki.weight + "kg");
		System.out.println();
		
		System.out.println("���O :" + takada.name);
		System.out.println("�g�� :" + takada.height + "cm");
		System.out.println("�̏d :" + takada.weight + "kg");
	}

}
