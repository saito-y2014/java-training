package Chap04;

import java.util.Scanner;

public class DigitPyramid {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�����s���~�b�h��\�����܂��B");
		System.out.print("�i���� : ");
		int n = stdIn.nextInt();
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n - i; j++)
				System.out.print(' ');
			for(int j = 1; j <=2 * i - 1; j++)
				System.out.print(i % 10);
			System.out.println();
		}
	}

}
