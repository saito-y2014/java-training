package Chap15;

import java.util.Scanner;

public class CompareString {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������s1 : "); String s1 = stdIn.next();
		System.out.print("������s2 : "); String s2 = stdIn.next();
		
		if(s1 == s2)
			System.out.println("s1 == s2 �ł��B");
		else
			System.out.println("s1 != s2 �ł��B");
		
		if(s1.equals(s2))
			System.out.println("s1��s2�̒��g�͓������B");
		else
			System.out.println("s1��s2�̒��g�͓������Ȃ��B");
	}

}