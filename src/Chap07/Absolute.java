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
		
		System.out.print("int   �^�����la�̒l : "); int    a = stdIn.nextInt();
		System.out.print("long  �^�����lb�̒l : "); long   b = stdIn.nextLong();
		System.out.print("float �^�����lc�̒l : "); float  c = stdIn.nextFloat();
		System.out.print("double�^�����ld�̒l : "); double d = stdIn.nextDouble();
		
		System.out.println("a�̐�Βl��" + absolute(a) + "�ł��B");
		System.out.println("b�̐�Βl��" + absolute(b) + "�ł��B");
		System.out.println("c�̐�Βl��" + absolute(c) + "�ł��B");
		System.out.println("d�̐�Βl��" + absolute(d) + "�ł��B");
	}

}
