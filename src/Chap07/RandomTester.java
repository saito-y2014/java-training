package Chap07;

import java.util.Random;
import java.util.Scanner;

public class RandomTester {
	static int random(int a, int b){
		if(b <= a)
			return a;
		else {
			Random rand = new Random();
			return a + rand.nextInt(b - a + 1);
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("乱数を生成します。");
		System.out.print("下限値 :"); int min = stdIn.nextInt();
		System.out.print("上限値 :"); int max = stdIn.nextInt();
		
		System.out.println("生成した乱数は" + random(min, max) + "です。");
	}

}
