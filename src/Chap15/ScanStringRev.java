package Chap15;

import java.util.Scanner;

public class ScanStringRev {
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("ï∂éöóÒ : ");
	String s = stdIn.next();
	
	System.out.print("ãtÇ©ÇÁì«ÇﬁÇ∆");
	for(int i = s.length() - 1; i >= 0; i--)
		System.out.print(s.charAt(i));
	System.out.println("Ç≈Ç∑ÅB");
	}

}
