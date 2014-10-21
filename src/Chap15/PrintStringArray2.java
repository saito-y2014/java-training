package Chap15;

import java.util.Scanner;

public class PrintStringArray2 {
	
	static void printString(String s){
		for(int i = 0; i < s.length(); i++)
			System.out.print(s.charAt(i));
	}
	
	static void printStringArray(String[] a){
		for(int i = 0; i < a.length; i++){
			printString(a[i]);
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("•¶Žš—ñ‚ÌŒÂ” : ");
		int n = stdIn.nextInt();
		String[] sx = new String[n];
		
		for(int i = 0; i < sx.length; i++){
			System.out.print("sx[" + i + "] = ");
			sx[i] = stdIn.next();
		}
		printStringArray(sx);
	}

}
