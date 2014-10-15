package Chap07;

import java.util.Scanner;

public class PrintSeason {
	static void printSeason(int m){
		switch (m) {
			case  3: case  4: case  5: System.out.print("t"); break;
			case  6: case  7: case  8: System.out.print("‰Ä"); break;
			case  9: case 10: case 11: System.out.print("H"); break;
			case 12: case  1: case  2: System.out.print("“~"); break;
		}
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int month;
		do {
			System.out.print("‰½Œ‚Å‚·‚©(1`12) :");
			month = stdIn.nextInt();
		}while(month < 1 || month > 12);
		
		System.out.print("‚»‚ÌŒ‚Ì‹Gß‚Í");
		printSeason(month);
		System.out.print("‚Å‚·B");
	}

}
