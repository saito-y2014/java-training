package Chap03;

import java.util.Scanner;

public class Diff2A {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a�F"); int a = stdIn.nextInt();
		System.out.print("����b�F"); int b = stdIn.nextInt();
		
		int diff;
		if(a >= b)
			diff = a - b;
		else
			diff = b - a;
		System.out.println("�����̍���" + diff + "�ł��B");
	}

}
