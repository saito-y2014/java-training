package Chap02;

import java.util.Scanner;

public class Globe2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		final double PI = 3.1416;
		
		System.out.println("���̕\�ʐςƑ̐ς����߂܂��B");
		System.out.print("���a�F");
		double r = stdIn.nextDouble();
		
		System.out.println("�\�ʐς�" + (4 * PI * r * r) + "�ł��B");
		System.out.println("�́@�ς�" + (4 / 3.0 * PI * r * r * r) + "�ł��B");
	}

}
