package Chap15;a

import java.util.Scanner;

public class SearchString1 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������s1 : "); String s1 = stdIn.next();
		System.out.print("������s2 : "); String s2 = stdIn.next();
		
		int idx = s1.indexOf(s2);
		if(idx == -1)
			System.out.println("s1����s2�͊܂܂�܂���B");
		else {
			System.out.println(s1);
			for(int i = 0; i < idx; i++)
				System.out.print(' ');
			System.out.println(s2);
		}
	}

}
