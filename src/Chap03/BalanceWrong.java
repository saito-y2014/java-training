package Chap03;

import java.util.Scanner;

public class BalanceWrong {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�ϐ�a�F"); int a = stdIn.nextInt();
		System.out.print("�ϐ�b�F"); int b = stdIn.nextInt();
		
		int diff = a - b;
		if (diff > 0)
			System.out.println("a�̂ق����傫���ł��B");
		else if(diff < 0)
			System.out.println("b�̂ق����傫���ł��B");
		else
			System.out.println("a��b�͓����l�ł��B");
	}

}
