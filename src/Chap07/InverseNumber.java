package Chap07;

import java.util.Scanner;

public class InverseNumber {
	static Scanner stdIn = new Scanner(System.in);
	
	static int randPlusInt(){
		int x;
		do {
			System.out.print("正の整数値 :");
			x = stdIn.nextInt();
		}while(x <= 0);
		return x;
	}
	
	public static void main(String[] args){
		int x;
		do {
			int n = randPlusInt();
			
			System.out.print("逆から読むと");
			while(n > 0){
				System.out.print(n % 10);
				n /= 10;
			}
			System.out.println("です。");
			
			do {
				System.out.print("もう一度？ <Yes・・・1 / No・・・0> :");
				x = stdIn.nextInt();
			}while (x != 0 && x != 1);
		}while (x == 1);
	}

}
