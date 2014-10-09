package Chap03;

import java.util.Scanner;

public class Sign2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = stdIn.nextInt();
		
		if(n == 1)
			System.out.println("それは１です。");
		else if(n == 2)
			System.out.println("それは２です。");
		else if(n == 3)
			System.out.println("それは３です。");
		else
			;
	}

}
