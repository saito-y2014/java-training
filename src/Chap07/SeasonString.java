package Chap07;

import java.util.Scanner;

public class SeasonString {
	static String seasonOf(int m){
		switch (m){
		case  3: case  4: case  5: return "t";
		case  6: case  7: case  8: return "‰Ä";
		case  9: case 10: case 11: return "H";
		case 12: case  1: case  2: return "“~";
		}
		return "";
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int month;
		do {
			System.out.print("‰½Œ‚Å‚·‚©(1`12) :");
			month = stdIn.nextInt();
		}while(month < 1 || month > 12);
		
		System.out.println("‚»‚ÌŒ‚Ì‹Gß‚Í" + seasonOf(month) + "‚Å‚·B");
	}

}
