package Chap15;a

import java.util.Scanner;

public class PrintDouble {
	static void printDouble(double x, int p, int w){
		System.out.printf(String.format("%%%d.%df", w, p), x);
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("À”’l : ");
		double x = stdIn.nextDouble();
		
		System.out.print("•\¦‘SŒ…” : ");
		int w = stdIn.nextInt();
		
		System.out.print("­”•”Œ…” : ");
		int p = stdIn.nextInt();
		
		printDouble(x, p, w);
		System.out.println();
	}

}
