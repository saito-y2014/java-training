package Chap11;

import java.util.GregorianCalendar;
import java.util.Random;
import static java.util.GregorianCalendar.*;

public class Omikuji2 {
	
	public static void main(String[] args){
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);
		int m = today.get(MONTH) + 1;
		int d = today.get(DATE);
		System.out.printf("¡“ú‚Í%04d”N%02dŒ%02d“ú‚Å‚·B\n", y, m, d);
		
		Random rand = new Random(10);
		int k = rand.nextInt(10);
		System.out.print("¡“ú‚Ì‰^¨‚Í");
		switch(k){
		case 0 :							System.out.print("‘å‹g");	break;
		case 1 : case 2 : case 3 :			System.out.print("‹g");		break;
		case 4 : case 5 : case 6 :			System.out.print("’†‹g");	break;
		case 7 : case 8 : 					System.out.print("¬‹g");	break;
		case 9 :							System.out.print("‹¥");		break;
		}
		System.out.println("‚Å‚·B");
	}
}