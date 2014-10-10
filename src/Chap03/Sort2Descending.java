package Chap03;

import java.util.Scanner;

public class Sort2Descending {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("変数a:"); int a = stdIn.nextInt();
		System.out.print("変数b:"); int b = stdIn.nextInt();
		
		if(a < b){         //a > bの場合は何もしないでそのまま表示する
			int t = a;     //tの中に一旦aを入れて
			a = b;         //aにbを入れて
			b = t;		   //bに元のaを入れてaとbを入れ替えている
		}
		System.out.println("a≧bとなるようにソートしました。");
		System.out.println("変数aは" + a + "です。");
		System.out.println("変数bは" + b + "です。");
		}

}
