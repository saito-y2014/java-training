package Chap02;

public class SumAve3B {
	public static void main(String[] args){
		int x, y, z;
		int sum;
		
		x = 63;
		y = 18;
		z = 52;
		sum = x + y + z;
		
		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("zの値は" + z + "です。");
		System.out.println("合計は" + sum + "です。");
		System.out.println("平均は" + sum / 3 + "です。");
	}

}
