package Chap07;

import java.util.Scanner;

public class SetBits {
	static void printBits(int x){
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	static int setN(int x, int pos, int n){
		return x | (~(~0 << n) << pos);
	}
	static int resetN(int x, int pos, int n){
		return x & ~(~(~0 << n) << pos);
	}
	static int inverseN(int x, int pos, int n){
		return x ^ (~(~0 << n) << pos);
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("����x��pos�r�b�g�ڂ���n�̃r�b�g�𑀍삵�܂��B");
		System.out.print("x   :"); int x = stdIn.nextInt();
		System.out.print("pos :"); int pos = stdIn.nextInt();
		System.out.print("n   :"); int n = stdIn.nextInt();
		
		System.out.print(  "x                = "); printBits(x);
		System.out.print("\nsetN(x, pos)     = "); printBits(setN(x, pos, n));
		System.out.print("\nresetN(x, pos)   = "); printBits(resetN(x, pos, n));
		System.out.print("\ninverseN(x, pos) = "); printBits(inverseN(x, pos, n));
		System.out.println();
	}

}
