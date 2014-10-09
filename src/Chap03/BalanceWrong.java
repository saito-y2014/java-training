package Chap03;

import java.util.Scanner;

public class BalanceWrong {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("変数a："); int a = stdIn.nextInt();
		System.out.print("変数b："); int b = stdIn.nextInt();
		
		int diff = a - b;
		if (diff > 0)
			System.out.println("aのほうが大きいです。");
		else if(diff < 0)
			System.out.println("bのほうが大きいです。");
		else
			System.out.println("aとbは同じ値です。");
	}

}
