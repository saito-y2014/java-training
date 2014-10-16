package Chap09;

public class HumanTester1 {
	public static void main(String[] args){
		Human suzuki = new Human("—é–Ø“ñ˜Y", 170, 60, new Day(1975,  3, 12));
		Human takada = new Human("‚“c—´ˆê", 166, 72, new Day(1987, 10,  7));
		
		System.out.println("suzuki = " + suzuki);
		
		System.out.println("takada = " + takada);
	}

}
