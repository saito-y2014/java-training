package Chap04;

import java.util.Scanner;

public class SumCountinueAve {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("®”‚ğ‰ÁZ‚µ‚Ü‚·B");
		System.out.print("‰½ŒÂ‰ÁZ‚µ‚Ü‚·‚© : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int count = 0;
		int i;
		for (i = 0; i < n; i++){
			System.out.print("®” : ");
			int t = stdIn.nextInt();
			if(t < 0){
				System.out.println("•‰‚Ì”‚Í‰ÁZ‚µ‚Ü‚¹‚ñB");
				continue;
			}
			sum += t;
			count++;
		}
		System.out.println("‡Œv‚Í" + sum + "‚Å‚·B");
		if(count != 0)
			System.out.println("•½‹Ï‚Í" + sum / count + "‚Å‚·B");
	}

}
