package Chap10;

public class HumanTester {
	public static void main(String[] args){
		Human suzuki = new Human("��ؓ�Y", 170, 60);
		Human takada = new Human("���c����", 166, 72);
		
		suzuki.putData();
		System.out.println("�ԍ� : " + suzuki.getId());
		
		System.out.println();
		
		takada.putData();
		System.out.println("�ԍ� : " + takada.getId());
	}

}
