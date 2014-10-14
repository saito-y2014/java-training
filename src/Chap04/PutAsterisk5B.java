package Chap04;

import java.util.Scanner;

public class PutAsterisk5B {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("‰½ŒÂ*‚ð•\Ž¦‚µ‚Ü‚·‚©F");
		int n = stdIn.nextInt();
		
		if (n > 0){
			for (int i = 0; i < n / 5; i++)
				System.out.println("*****");
			int rest = n % 5;
			if (rest > 0){
				for (int i = 0; i < rest; i++)
					System.out.print('*');
				System.out.println();
			}
		}
	}

}
