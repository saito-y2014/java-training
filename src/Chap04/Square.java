package Chap04;

import java.util.Scanner;

public class Square {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�����`��\�����܂��B");
		System.out.print("�i���� : ");
		int n = stdIn.nextInt();
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
