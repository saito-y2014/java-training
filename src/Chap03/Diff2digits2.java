package Chap03;

import java.util.Scanner;

public class Diff2digits2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("êÆêîAÅF"); int a = stdIn.nextInt();
		System.out.print("êÆêîBÅF"); int b = stdIn.nextInt();
		
		int diff = a >= b ? a - b : b - a;
		
		System.out.println("ÇªÇÍÇÁÇÃç∑ÇÕ" + (diff <= 10 ? "10à»â∫" : "11à»è„") + "Ç≈Ç∑ÅB");
		
	}

}
