package Chap4;

import java.util.Scanner;

public class DigitNo {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���̐����l�̌��������߂܂��B");
		int x;
		do {
			System.out.print("���̐����l�F");
			x = stdIn.nextInt();
		} while (x <= 0);
		
		int digits = 0;
		while (x > 0){
			digits++;
			x /= 10;
		}
		System.out.println("���̐���" + digits + "���ł��B");
	}

}
