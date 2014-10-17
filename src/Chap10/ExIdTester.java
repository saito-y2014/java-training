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
		
		System.out.println("aの識別番号 : " + a.getId());
		System.out.println("bの識別番号 : " + b.getId());
		System.out.println("cの識別番号 : " + c.getId());
		System.out.println("dの識別番号 : " + d.getId());
		System.out.println("eの識別番号 : " + e.getId());
		System.out.println("fの識別番号 : " + f.getId());
		
		int max = ExId.getMaxId();
		System.out.println("最後に与えた識別番号 = " + max);
		System.out.println("次回に与える識別番号 = " + (max + ExId.getStep()));
	}

}
