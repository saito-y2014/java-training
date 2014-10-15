package Chap07;

import java.util.Scanner;

public class SumUp1 {
	static int sumUp(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++)
			sum += i;
		return sum;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1‚©‚çx‚Ü‚Å‚Ì˜a‚ð‹‚ß‚Ü‚·B");
		int x;
		do {
			System.out.print("x‚Ì’l :");
			x = stdIn.nextInt();
		}while(x <= 0);
		
		System.out.println("1‚©‚ç" + x + "‚Ü‚Å‚Ì˜a‚Í" + sumUp(x) + "‚Å‚·B");
	}

}
