package Chap06;

import java.util.Scanner;

public class LinearSeachBotton {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数 :");
		int n = stdIn.nextInt();
		int [] a = new int[n];
		
		for(int j = 0; j < n; j++){
			System.out.print("a[" + j + "] =");
			a[j] = stdIn.nextInt();
		}
		
		System.out.print("探す数値 :");
		int key = stdIn.nextInt();
		
		int i;
		for(i = n - 1; i >= 0; i--)
			if(a[i] == key)
				break;
		
		if(i >= 0)
			System.out.print("それはa[" + i + "]のにあります。");
		else
			System.out.print("それはありません。");
	}

}
