package Chap04;

import java.util.Scanner;

public class ThreeDigits {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int x;
		do{
			System.out.print("3Œ…‚Ì³‚Ì®”’lF");
			x = stdIn.nextInt();
		} while (x < 100 || x >999);
		
		System.out.println(x + "‚Æ“ü—Í‚µ‚Ü‚µ‚½‚ËB");
	}

}
