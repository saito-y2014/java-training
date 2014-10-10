package Chap03;

import java.util.Scanner;

public class Season {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("‰½Œ‚Å‚·‚©F");
		int month = stdIn.nextInt();
		
		switch(month){
		case  3:
		case  4:
		case  5: System.out.println("t"); break;
		case  6:
		case  7:
		case  8: System.out.println("‰Ä"); break;
		case  9:
		case 10:
		case 11: System.out.println("H"); break;
		case 12:
		case  1:
		case  2: System.out.println("“~"); break;
		default : System.out.println("‚»‚ñ‚ÈŒ‚Í‚ ‚è‚Ü‚¹‚ñB"); break;
		}
	}

}
