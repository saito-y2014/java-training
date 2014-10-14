package Chap04;

import java.util.Scanner;

public class Measure {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”’lF");
		int n = stdIn.nextInt();
		
		int count = 0;
		for (int i = 1; i <= n; i++)
			if(n % i == 0){
				System.out.print(i + " ");
				count++;
			}
	}
	

}
