package Chap07;

import java.util.Scanner;

public class Min3 {
	static int min(int a, int b, int c){
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”a :"); int a = stdIn.nextInt();
		System.out.print("®”b :"); int b = stdIn.nextInt();
		System.out.print("®”c :"); int c = stdIn.nextInt();
		
		System.out.println("Å¬’l‚Í" + min(a, b, c) + "‚Å‚·B");
	}

}
