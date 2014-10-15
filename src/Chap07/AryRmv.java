package Chap07;

import java.util.Scanner;

public class AryRmv {
	static void aryRmv(int[] a, int idx){
		if(idx >= 0 && idx < a.length){
			for(int i = idx; i < a.length - 1; i++)
				a[i] = a[i + 1];
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数 : ");
		int num = stdIn.nextInt();
		int[] a = new int[num];
		
		for (int i = 0; i < num; i++){
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("削除する要素のインデックス : ");
		int idx = stdIn.nextInt();
		
		aryRmv(a, idx);
		
		for(int i = 0; i < num; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
