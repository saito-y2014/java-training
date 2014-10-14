package Chap05;

import java.util.Scanner;

public class Average3A {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数値xとyとzの平均値を求めます。");
		System.out.print("xの値 :"); int x = stdIn.nextInt();
		System.out.print("yの値 :"); int y = stdIn.nextInt();
		System.out.print("zの値 :"); int z = stdIn.nextInt();
		
		double ave = (x + y + z) / 3.0;
		System.out.printf("xとyの平均値は%.3fです。 \n", ave);
	}

}
