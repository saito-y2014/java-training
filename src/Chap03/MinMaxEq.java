package Chap03;

import java.util.Scanner;

public class MinMaxEq {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����A�F"); int a = stdIn.nextInt();
		System.out.print("����B�F"); int b = stdIn.nextInt();
		
		if(a == b)
			System.out.println("��̒l�͓����ł��B");
		else {
			int min, max;
			if(a < b){
				min = a;
				max = b;
			}else{
				min = b;
				max = a;
			}
			System.out.println("�������ق��̒l��" + min + "�ł��B");
			System.out.println("�傫���ق��̒l��" + max + "�ł��B");
		}
	}
}
