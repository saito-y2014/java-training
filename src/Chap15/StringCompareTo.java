package Chap15;

import java.util.Scanner;

public class StringCompareTo {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("•¶š—ñs1 : "); String s1 = stdIn.next();
		System.out.print("•¶š—ñs2 : "); String s2 = stdIn.next();
		
		int balance = s1.compareTo(s2);
		if(balance < 0)
			System.out.println("s1‚Ì‚Ù‚¤‚ª¬‚³‚¢B");
		else if(balance > 0)
			System.out.println("s2‚Ì‚Ù‚¤‚ª¬‚³‚¢B");
		else
			System.out.println("s1‚Æs2‚Í“™‚µ‚¢B");
	}

}
