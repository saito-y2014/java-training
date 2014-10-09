package Chap02;

import java.util.Random;
import java.util.Scanner;

public class RandomPlusMinus5 {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int x = stdIn.nextInt();
		
		System.out.println("その値±5の乱数を生成しました。");
		System.out.println("値は" + (x - 5 + rand.nextInt(11)) + "です。");
	}
}
