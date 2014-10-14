package Chap05;

import java.util.Scanner;

public class Average3B {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数値 xとyとzの平均値を求めます。");
		System.out.print("xの値 :"); int x = stdIn.nextInt();
		System.out.print("yの値 :"); int y = stdIn.nextInt();
		System.out.print("zの値 :"); int z = stdIn.nextInt();
		
		double ave = (double)(x + y + z) / 3;
		System.out.printf("xとyとzの平均値は%.3fです。 \n", ave);
	}

}
