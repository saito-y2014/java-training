package Chap13;

public class AnimalTester1 {
	public static void main(String[] args){
		Animal[] a = new Animal[2];
		a[0] = new Dog("�n�`��", "�Č�");
		a[1] = new Cat("�}�C�P��", 7);
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
