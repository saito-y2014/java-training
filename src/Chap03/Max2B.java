package Chap03;

import java.util.Scanner;

public class Max2B {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����la�F"); double a = stdIn.nextDouble();
		System.out.print("�����lb�F"); double b = stdIn.nextDouble();
		
		double max = a > b ? a : b;
		System.out.println("�傫���ق��̒l��" + max + "�ł��B");
	}

}
