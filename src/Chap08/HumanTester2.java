package Chap08;

public class HumanTester2 {
	public static void main(String[] args){
		Human2 suzuki = new Human2("��ؓ�Y", 170, 60);
		Human2 takada = new Human2("���c����", 166, 72);
		
		suzuki.gainWeight(3);
		takada.reduceWeight(5);
		
		System.out.println("���O :" + suzuki.getName());
		System.out.println("�g�� :" + suzuki.getHeight() + "cm");
		System.out.println("�̏d :" + suzuki.getWeight() + "kg");
		System.out.println();
		
		System.out.println("���O :" + takada.getName());
		System.out.println("�g�� :" + takada.getHeight() + "cm");
		System.out.println("�̏d :" + takada.getWeight() + "kg");
	}

}
