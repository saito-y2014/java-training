package Chap10;

public class HumanTester {
	public static void main(String[] args){
		Human suzuki = new Human("—é–Ø“ñ˜Y", 170, 60);
		Human takada = new Human("‚“c—´ˆê", 166, 72);
		
		suzuki.putData();
		System.out.println("”Ô† : " + suzuki.getId());
		
		System.out.println();
		
		takada.putData();
		System.out.println("”Ô† : " + takada.getId());
	}

}
