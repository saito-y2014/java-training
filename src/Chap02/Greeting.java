package Chap02;

import java.util.Scanner;

public class Greeting {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("ê©ÅF"); String firstName = stdIn.next();
		System.out.print("ñºÅF"); String lastName = stdIn.next();
		
		System.out.println("Ç±ÇÒÇ…ÇøÇÕ" + firstName + lastName + "Ç≥ÇÒÅB");
	}

}
