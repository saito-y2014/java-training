package Chap04;

import java.util.Scanner;

public class IsoscelesTriangleRB {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�E�����p�̓񓙕ӎO�p�`��\�����܂��B");
		System.out.print("�i���� : ");
		int n = stdIn.nextInt();
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n - i; j++)
				System.out.print(' ');
			for(int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
