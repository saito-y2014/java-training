package Chap05;

import java.util.Scanner;

public class OctHex {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� : ");
		int x = stdIn.nextInt();
		
		System.out.printf(" 8�i���ł�%o�ł��B�@\n", x);
		System.out.printf("16�i���ł�%x�ł��B�@\n", x);
	}

}
