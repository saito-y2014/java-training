package Chap03;

import java.util.Scanner;

public class Diff2difits1 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a:"); int a = stdIn.nextInt();
		System.out.print("����b�F"); int b = stdIn.nextInt();
		
		int diff = a >= b ? a - b : b - a;
		
		if(diff <= 10)
			System.out.println("�����̍���10�ȉ��ł��B");
		else
			System.out.println("�����̍���11�ȏ�ł��B");
		
	}

}
