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
		
		System.out.println("a‚Ì¯•Ê”Ô† : " + a.getId());
		System.out.println("b‚Ì¯•Ê”Ô† : " + b.getId());
		System.out.println("c‚Ì¯•Ê”Ô† : " + c.getId());
		System.out.println("d‚Ì¯•Ê”Ô† : " + d.getId());
		System.out.println("e‚Ì¯•Ê”Ô† : " + e.getId());
		System.out.println("f‚Ì¯•Ê”Ô† : " + f.getId());
		
		int max = ExId.getMaxId();
		System.out.println("ÅŒã‚É—^‚¦‚½¯•Ê”Ô† = " + max);
		System.out.println("Ÿ‰ñ‚É—^‚¦‚é¯•Ê”Ô† = " + (max + ExId.getStep()));
	}

}
