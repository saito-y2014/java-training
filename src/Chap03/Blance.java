package Chap03;

import java.util.Scanner;

public class Blance {
	public static void main(String[] args){
		Scanner stdInt = new Scanner(System.in);
		
		System.out.print("�ϐ�a�F"); int a = stdInt.nextInt();
		System.out.print("�ϐ�b�F"); int b = stdInt.nextInt();
		
		if(a > b)
			System.out.println("a�̂ق����傫���ł��B");
		else if(a < b)
			System.out.println("b�̂ق����傫���ł��B");
		else
			System.out.println("a��b�͓����l�ł��B");
	}

}
