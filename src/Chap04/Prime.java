package Chap04;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("2ˆÈã‚Ì®”’l : ");
			n = stdIn.nextInt();
		}while(n < 2);
		
		int i;
		for(i =2; i < n; i++)
			if(n % i == 0)
				break;
		
		if(i == n)
			System.out.println("‚»‚ê‚Í‘f”‚Å‚·B");
		else
			System.out.println("‚»‚ê‚Í‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñB");
	}
}
