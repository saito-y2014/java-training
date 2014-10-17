package Chap10;

public class IdTester2 {
	public static void main(String[] args){
		Id2 a = new Id2();
		Id2 b = new Id2();
		
		System.out.println("a‚Ì¯•Ê”Ô†  : " + a.getId());
		System.out.println("b‚Ì¯•Ê”Ô†  : " + b.getId());
		
		System.out.println("Id.conuter = " + Id2.counter);
		System.out.println("a.counter  = " +  a.counter);
		System.out.println("b.counter  = " +  b.counter);
	}

}
