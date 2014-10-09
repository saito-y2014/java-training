package Chap03;

import java.util.Scanner;

public class Modulo3 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = stdIn.nextInt();
		
		if(n > 0)
			if(n % 3 == 0)
				System.out.println("その値は３で割り切れます。");
			else if(n % 3 == 1)
				System.out.println("その値を３で割った余りは1です。");
			else
				System.out.println("その値を３で割った余りは２です。");
		else
			System.out.println("正でない値が入力されました。");
				
	}

}
