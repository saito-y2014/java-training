package Chap10;

public class ExIdTester {
	public static void main(String[] args){
		ExId a = new ExId();
		ExId b = new ExId();
		ExId c = new ExId();
		ExId.setStep(4);
		ExId d = new ExId();
		ExId e = new ExId();
		ExId f = new ExId();
		
		System.out.println("a�̎��ʔԍ� : " + a.getId());
		System.out.println("b�̎��ʔԍ� : " + b.getId());
		System.out.println("c�̎��ʔԍ� : " + c.getId());
		System.out.println("d�̎��ʔԍ� : " + d.getId());
		System.out.println("e�̎��ʔԍ� : " + e.getId());
		System.out.println("f�̎��ʔԍ� : " + f.getId());
		
		int max = ExId.getMaxId();
		System.out.println("�Ō�ɗ^�������ʔԍ� = " + max);
		System.out.println("����ɗ^���鎯�ʔԍ� = " + (max + ExId.getStep()));
	}

}
