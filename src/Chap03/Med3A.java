package Chap03;

import java.util.Scanner;

public class Med3A {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����A�F"); int a = stdIn.nextInt();
		System.out.print("����B�F"); int b = stdIn.nextInt();
		System.out.print("����C�F"); int c = stdIn.nextInt();
		
		int med;
			if((b >= a && a >= c)||(b <= a && a <= c))
				med = a;
			else if((a > b && c < b)||(a < b && c > b))
				med = b;
			else
				med = c;
		
		System.out.println("�����l��" + med + "�ł��B");
	}
	

}