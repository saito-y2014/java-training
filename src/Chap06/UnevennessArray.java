package Chap06;

import java.util.Scanner;

public class UnevennessArray {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("凸凹な２次元配列を作ります。");
		System.out.print("行数 :");
		int height = stdIn.nextInt();
		
		int[][] c = new int[height][];
		
		for (int i = 0; i < c.length; i++){
			System.out.println(i + "行目の列数 :");
			int width = stdIn.nextInt();
			c[i] = new int[width];
		}
		
		System.out.println("各要素の値を入力せよ。");
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j++){
				System.out.printf("c[%d][%d] :", i, j);
				c[i][j] = stdIn.nextInt();
			}
		}
		System.out.println("配列cの各要素の値は次のようになっています。");
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j ++)
				System.out.printf("%3d", c[i][j]);
			System.out.println();	
			
		}
	}

}
