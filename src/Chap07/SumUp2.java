package Chap07;

import java.util.Scanner;

public class SumUp2 {
	static int sumUp(int n){
		int sum = 0;
		while (n > 0)
			sum += n--;
		return sum;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1����x�܂ł̘a�����߂܂��B");
		int x;
		do {
			System.out.print("x�̒l :");
			x = stdIn.nextInt();
		}while(x <= 0);
		
		System.out.println("1����" + x + "�܂ł̘a��" + sumUp(x) + "�ł��B");
	}

}
