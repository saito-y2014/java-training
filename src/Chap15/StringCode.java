package Chap15;a

import java.util.Scanner;

public class StringCode {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������s : ");
		String s = stdIn.next();
		
		for(int i = 0; i < s.length(); i++)
			System.out.printf("s[%d] = %c %04X\n", i, s.charAt(i), (int)s.charAt(i));
	}

}
