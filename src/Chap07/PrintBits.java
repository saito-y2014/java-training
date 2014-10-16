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
		
		System.out.print("byte 型整数aの値 : "); byte  a = stdIn.nextByte();
		System.out.print("short型整数bの値 : "); short b = stdIn.nextShort();
		System.out.print("int  型整数cの値 : "); int   c = stdIn.nextInt();
		System.out.print("long 型整数dの値 : "); long  d = stdIn.nextLong();
		
		System.out.print(  "aのビット : "); printBits(a);
		System.out.print("\nbのビット : "); printBits(b);
		System.out.print("\ncのビット : "); printBits(c);
		System.out.print("\ndのビット : "); printBits(d);
		System.out.println();
	}
		

}
