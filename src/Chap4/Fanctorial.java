package Chap4;

import java.util.Scanner;

public class Fanctorial {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("���̐����l�F");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int factorial = 1;
		int i = 1;
		
		while (i <= n){
			factorial *= i;
			i++;
		}
		System.out.println("�P����" + n + "�܂ł̐ς�" + factorial + "�ł��B");
	}

}
