package Chap04;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("2�ȏ�̐����l : ");
			n = stdIn.nextInt();
		}while(n < 2);
		
		int i;
		for(i =2; i < n; i++)
			if(n % i == 0)
				break;
		
		if(i == n)
			System.out.println("����͑f���ł��B");
		else
			System.out.println("����͑f���ł͂���܂���B");
	}
}
