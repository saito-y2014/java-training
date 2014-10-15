package Chap07;

import java.util.Scanner;

public class AryIns {
	static void aryIns(int[] a, int idx, int x){
		if(idx >= 0 && idx < a.length){
			for(int i = a.length - 1; i > idx; i--)
				a[i] = a[i - 1];
			a[idx] = x;
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数 : ");
		int num = stdIn.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("挿入する要素のインデックス : ");
		int idx = stdIn.nextInt();
		
		System.out.print("挿入する値 : ");
		int x = stdIn.nextInt();
		
		aryIns(a, idx, x);
		
		for(int i = 0; i < num; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
