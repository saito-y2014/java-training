package Chap07;

import java.util.Scanner;

public class InverseNumber {
	static Scanner stdIn = new Scanner(System.in);
	
	static int randPlusInt(){
		int x;
		do {
			System.out.print("���̐����l :");
			x = stdIn.nextInt();
		}while(x <= 0);
		return x;
	}
	
	public static void main(String[] args){
		int x;
		do {
			int n = randPlusInt();
			
			System.out.print("�t����ǂނ�");
			while(n > 0){
				System.out.print(n % 10);
				n /= 10;
			}
			System.out.println("�ł��B");
			
			do {
				System.out.print("������x�H <Yes�E�E�E1 / No�E�E�E0> :");
				x = stdIn.nextInt();
			}while (x != 0 && x != 1);
		}while (x == 1);
	}

}
