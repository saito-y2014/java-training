package Chap04;

import java.util.Scanner;

public class SumBreak1Ave {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i;
		for (i = 0; i < n; i++){
			System.out.print("整数(0で終了) : ");
			int t = stdIn.nextInt();
			if(t == 0) break;
			sum += t;
		}
		System.out.println("合計は" + sum + "です。");
		if(i != 0)
			System.out.println("平均は" + sum / i + "です。");
	}

}
