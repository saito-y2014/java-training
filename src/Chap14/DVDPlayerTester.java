package Chap14;

public class DVDPlayerTester {
	public static void main(String[] args){
		DVDPlayer a = new DVDPlayer();
		Player    b = new DVDPlayer();
		ExPlayer  c = new DVDPlayer();
		
		System.out.println("DVDPlayer�^�ϐ�a");
		a.play();
		a.stop();
		a.slow();
		
		System.out.println("Player�^�ϐ�b");
		b.play();
		b.stop();
		
		System.out.println("ExPlayer�^�ϐ�c");
		c.play();
		c.stop();
		c.slow();
	}

}
