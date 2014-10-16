package Chap09;

public class periodTester {
	public static void main(String[] args){
		Period meiji  = new Period(new Day(1868,  9,  8), new Day(1912,  7, 30));
		Period taisho = new Period(new Day(1912,  7, 30), new Day(1926, 12, 25));
		Period shouwa = new Period(new Day(1926, 12, 25), new Day(1989,  1, 18));
		
		System.out.println("ñæé° = " + meiji);
		System.out.println("ëÂê≥ = " + taisho);
		System.out.println("è∫òa = " + shouwa);
	}

}
