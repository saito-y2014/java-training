package Chap03;

import java.util.Scanner;

public class Measure2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�ϐ�A:"); int a = stdIn.nextInt();
		System.out.print("�ϐ�B�F"); int b = stdIn.nextInt();
		
		if(!(a % b == 0))
			System.out.println("B��A�̖񐔂ł͂���܂���B");
		else
			System.out.println("B��A�̖񐔂ł��B");
	}

}
