package Chap03;

import java.util.Scanner;

public class Med3A {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A："); int a = stdIn.nextInt();
		System.out.print("整数B："); int b = stdIn.nextInt();
		System.out.print("整数C："); int c = stdIn.nextInt();
		
		int med;
			if((b >= a && a >= c)||(b <= a && a <= c))
				med = a;
			else if((a > b && c < b)||(a < b && c > b))
				med = b;
			else
				med = c;
		
		System.out.println("中央値は" + med + "です。");
	}
	

}