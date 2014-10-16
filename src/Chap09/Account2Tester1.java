package Chap09;

public class Account2Tester1 {
	public static void main(String[] args){
		Day d = new Day(2010, 10, 15);
		Account2 suzuki = new Account2("—é–Øˆê˜Y", "125768", 100, d);
		
		Day p = suzuki.getOpenDay();
		System.out.println("ŒûÀŠJİ“ú : " + p);
		
		p.set(1999, 12, 31);
		
		Day q = suzuki.getOpenDay();
		System.out.println("ŒûÀŠJİ“ú : " + q);
	}

}
