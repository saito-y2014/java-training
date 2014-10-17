package Chap10;

public class IdTester {
	public static void main(String[] args){
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a‚Ì¯•Ê”Ô† : " + a.getId());
		System.out.println("b‚Ì¯•Ê”Ô† : " + b.getId());
		
		System.out.println("ÅŒã‚É—^‚¦‚½¯•Ê”Ô† = " + Id.getMaxId());
		System.out.println("ÅŒã‚É—^‚¦‚½¯•Ê”Ô† = " +  a.getMaxId());
		System.out.println("ÅŒã‚É—^‚¦‚½¯•Ê”Ô† = " +  b.getMaxId());
	}

}
