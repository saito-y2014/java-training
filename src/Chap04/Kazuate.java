package Chap04;

import java.util.Random;
import java.util.Scanner;

public class Kazuate {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		final int MAX_NO = 6;
		int leftNo = MAX_NO;
		int no = rand.nextInt(100);
		
		System.out.println("数当てゲーム開始!!");
		System.out.println("0〜99の数を当ててください。");
		
		int x;
		do {
			System.out.print("残り" + (leftNo--) + "回。 いくつかな :");
			x = stdIn.nextInt();
			
			if(x > no)
				System.out.println("もっと小さな数だよ。");
			else if(x < no)
				System.out.println("もっと大きな数だよ。");
		}while(x != no && leftNo > 0);
		
		if(x == no)
			System.out.println((MAX_NO - leftNo) + "回で当たりましたね。");
		else
			System.out.println("残念。正解は" + no + "でした。");
	}

}
