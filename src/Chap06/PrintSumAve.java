package Chap06;

import java.util.Scanner;

public class PrintSumAve {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("人数 :");
		int ninzu = stdIn.nextInt();
		int [] tensu = new int[ninzu];
		
		System.out.println("点数を入力せよ。");
		int sum = 0;
		for (int i = 0; i < ninzu; i++){
			System.out.print((i + 1) + "番の点数 :");
			tensu[i] = stdIn.nextInt();
			sum += tensu[i];
		}
		
		int max = tensu[0];
		int min = tensu[0];
		for(int i = 1;i < ninzu; i++){
			if(tensu[i] > max) max = tensu[i];
			if(tensu[i] < min) min = tensu[i];
		}
		
		System.out.println("合計点は" + sum + "点です。");
		System.out.println("平均点は" + (double)sum / ninzu + "点です。");
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
		}

}
