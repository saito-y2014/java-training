package Chap07;

import java.util.Scanner;

public class ShiftValue {
	static int pow2(int no){
		int pw = 1;
		while (no-- > 0)
			pw *= 2;
		return pw;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数xをnビットシフトします。");
		System.out.print("x : "); int x = stdIn.nextInt();
		System.out.print("n : "); int n = stdIn.nextInt();
		
		int mPower = x * pow2(n);
		int dPower = x / pow2(n);
		
		int lShift = x << n;
		int rShift = x >> n;
		
		System.out.printf("[a] x × (2の%d乗) = %d\n", n, mPower);
		System.out.printf("[b] x ÷ (2の%d乗) = %d\n", n, dPower);
		System.out.printf("[c] x << %d = %d\n", n, lShift);
		System.out.printf("[d] x >> %d = %d\n", n, rShift);
		
		System.out.println("[a]と[c]の値は一致" + ((mPower == lShift) ? "します。" : "しません。"));
		System.out.println("[b]と[d]の値は一致" + ((dPower == rShift) ? "します。" : "しません。"));
	}

}
