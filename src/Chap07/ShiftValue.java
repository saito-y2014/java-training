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
		
		System.out.println("����x��n�r�b�g�V�t�g���܂��B");
		System.out.print("x : "); int x = stdIn.nextInt();
		System.out.print("n : "); int n = stdIn.nextInt();
		
		int mPower = x * pow2(n);
		int dPower = x / pow2(n);
		
		int lShift = x << n;
		int rShift = x >> n;
		
		System.out.printf("[a] x �~ (2��%d��) = %d\n", n, mPower);
		System.out.printf("[b] x �� (2��%d��) = %d\n", n, dPower);
		System.out.printf("[c] x << %d = %d\n", n, lShift);
		System.out.printf("[d] x >> %d = %d\n", n, rShift);
		
		System.out.println("[a]��[c]�̒l�͈�v" + ((mPower == lShift) ? "���܂��B" : "���܂���B"));
		System.out.println("[b]��[d]�̒l�͈�v" + ((dPower == rShift) ? "���܂��B" : "���܂���B"));
	}

}
