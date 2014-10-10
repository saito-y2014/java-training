package Chap03;

import java.util.Scanner;

public class Med3 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A："); int a = stdIn.nextInt();
		System.out.print("整数B："); int b = stdIn.nextInt();
		System.out.print("整数C："); int c = stdIn.nextInt();
		
		int med;
		if(a >= b)
			if(b >= c)
				med = b;
			else if(a <= c)
				med = a;
			else
				med = c;
		else if(a > c)
			med = a;
		else if(b > c)
			med = c;
		else
			med = b;
		
		System.out.println("中央値は" + med + "です。");
	}

}
