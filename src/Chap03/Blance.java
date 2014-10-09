package Chap03;

import java.util.Scanner;

public class Blance {
	public static void main(String[] args){
		Scanner stdInt = new Scanner(System.in);
		
		System.out.print("変数a："); int a = stdInt.nextInt();
		System.out.print("変数b："); int b = stdInt.nextInt();
		
		if(a > b)
			System.out.println("aのほうが大きいです。");
		else if(a < b)
			System.out.println("bのほうが大きいです。");
		else
			System.out.println("aとbは同じ値です。");
	}

}
