package Chap07;

import java.util.Scanner;

public class PrintBits {
	static void printBits(byte x){
		for(int i = 7; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	static void printBits(short x){
		for(int i = 15; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	static void printBits(int x){
		for(int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		
	}
		
	static void printBits(long x){
		for(int i = 63; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("byte �^����a�̒l : "); byte  a = stdIn.nextByte();
		System.out.print("short�^����b�̒l : "); short b = stdIn.nextShort();
		System.out.print("int  �^����c�̒l : "); int   c = stdIn.nextInt();
		System.out.print("long �^����d�̒l : "); long  d = stdIn.nextLong();
		
		System.out.print(  "a�̃r�b�g : "); printBits(a);
		System.out.print("\nb�̃r�b�g : "); printBits(b);
		System.out.print("\nc�̃r�b�g : "); printBits(c);
		System.out.print("\nd�̃r�b�g : "); printBits(d);
		System.out.println();
	}
		

}
