package Chap10;

public class IdTester {
	public static void main(String[] args){
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a�̎��ʔԍ�  : " + a.getId());
		System.out.println("b�̎��ʔԍ�  : " + b.getId());
		
		System.out.println("Id.conuter = " + Id.counter);
		System.out.println("a.counter  = " +  a.counter);
		System.out.println("b.counter  = " +  b.counter);
	}

}