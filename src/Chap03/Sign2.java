package Chap03;

import java.util.Scanner;

public class Sign2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		if(n == 1)
			System.out.println("����͂P�ł��B");
		else if(n == 2)
			System.out.println("����͂Q�ł��B");
		else if(n == 3)
			System.out.println("����͂R�ł��B");
		else
			;
	}

}
