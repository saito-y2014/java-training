package Chap15;

import java.util.Scanner;

public class StringCompareTo {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������s1 : "); String s1 = stdIn.next();
		System.out.print("������s2 : "); String s2 = stdIn.next();
		
		int balance = s1.compareTo(s2);
		if(balance < 0)
			System.out.println("s1�̂ق����������B");
		else if(balance > 0)
			System.out.println("s2�̂ق����������B");
		else
			System.out.println("s1��s2�͓������B");
	}

}
