package Chap07;

import java.util.Scanner;

public class Absolute {
	static int absolute(int x){
		return x >= 0 ? x : -x;
	}
	
	static long sbsolute(long x){
		return x >= 0 ? x : -x;
	}
	
	static float absolute(float x){
		return x >= 0 ? x : -x;
	}
	
	static double absolute(double x){
		return x >= 0 ? x : -x;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("int   型整数値aの値 : "); int    a = stdIn.nextInt();
		System.out.print("long  型整数値bの値 : "); long   b = stdIn.nextLong();
		System.out.print("float 型整数値cの値 : "); float  c = stdIn.nextFloat();
		System.out.print("double型整数値dの値 : "); double d = stdIn.nextDouble();
		
		System.out.println("aの絶対値は" + absolute(a) + "です。");
		System.out.println("bの絶対値は" + absolute(b) + "です。");
		System.out.println("cの絶対値は" + absolute(c) + "です。");
		System.out.println("dの絶対値は" + absolute(d) + "です。");
	}

}
