package Chap14;

public class DVDPlayerTester {
	public static void main(String[] args){
		DVDPlayer a = new DVDPlayer();
		Player    b = new DVDPlayer();
		ExPlayer  c = new DVDPlayer();
		
		System.out.println("DVDPlayerŒ^•Ï”a");
		a.play();
		a.stop();
		a.slow();
		
		System.out.println("PlayerŒ^•Ï”b");
		b.play();
		b.stop();
		
		System.out.println("ExPlayerŒ^•Ï”c");
		c.play();
		c.stop();
		c.slow();
	}

}
