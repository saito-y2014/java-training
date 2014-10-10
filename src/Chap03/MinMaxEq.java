package Chap03;

import java.util.Scanner;

public class MinMaxEq {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A："); int a = stdIn.nextInt();
		System.out.print("整数B："); int b = stdIn.nextInt();
		
		if(a == b)
			System.out.println("二つの値は同じです。");
		else {
			int min, max;
			if(a < b){
				min = a;
				max = b;
			}else{
				min = b;
				max = a;
			}
			System.out.println("小さいほうの値は" + min + "です。");
			System.out.println("大きいほうの値は" + max + "です。");
		}
	}
}
