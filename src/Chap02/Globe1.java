package Chap02;

import java.util.Scanner;

public class Globe1 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���̕\�ʐςƑ̐ς����߂܂��B");
		System.out.print("���a�F");
		double r = stdIn.nextDouble();
		
		System.out.println("�\�ʐς�" + (4 * 3.14 * r * r) + "�ł��B");
		System.out.println("�́@�ς�" + (4 / 3.0 * 3.14 * r * r * r) + "�ł��B");
	}
}
