package Chap07;

import java.util.Scanner;

public class SumUp2 {
	static int sumUp(int n){
		int sum = 0;
		while (n > 0)
			sum += n--;
		return sum;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1‚©‚çx‚Ü‚Å‚Ì˜a‚ğ‹‚ß‚Ü‚·B");
		int x;
		do {
			System.out.print("x‚Ì’l :");
			x = stdIn.nextInt();
		}while(x <= 0);
		
		System.out.println("1‚©‚ç" + x + "‚Ü‚Å‚Ì˜a‚Í" + sumUp(x) + "‚Å‚·B");
	}

}
