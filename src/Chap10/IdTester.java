package Chap10;

public class IdTester {
	public static void main(String[] args){
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a�̎��ʔԍ� : " + a.getId());
		System.out.println("b�̎��ʔԍ� : " + b.getId());
		
		System.out.println("�Ō�ɗ^�������ʔԍ� = " + Id.getMaxId());
		System.out.println("�Ō�ɗ^�������ʔԍ� = " +  a.getMaxId());
		System.out.println("�Ō�ɗ^�������ʔԍ� = " +  b.getMaxId());
	}

}
