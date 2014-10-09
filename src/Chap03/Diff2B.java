package Chap03;

import java.util.Scanner;

public class Diff2B {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("êÆêîaÅF"); int a = stdIn.nextInt();
		System.out.print("êÆêîb:"); int b = stdIn.nextInt();
		
		int diff = a >= b ? a - b : b - a;
		
		System.out.println("ÇªÇÍÇÁÇÃç∑ÇÕ" + diff + "Ç≈Ç∑ÅB");
	}
	

}
