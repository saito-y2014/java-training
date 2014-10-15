package Chap07;

import java.util.Scanner;

public class LinearSearch {
	static int linearSearch(int[] a,int key){
		for(int i = 0; i < a.length; i++)
			if(a[i] == key)
				return i;
		return -1;
	}
	
	static int linearSearchR(int[] a, int key){
		for(int i = a.length - 1; i >= 0; i--)
			if(a[i] == key)
				return i;
		return -1;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数 :");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}
		System.out.print("探す値 :");
		int ky = stdIn.nextInt();
		
		int idxTop = linearSearch( x, ky);
		int idxBtm = linearSearchR(x, ky);
		
		if(idxTop == -1)
			System.out.println("その値の要素は存在しません。");
		else if(idxTop == idxBtm)
			System.out.println("その値はx[" + idxTop + "]にあります。");
		else{
			System.out.println("その値の要素は複数存在します。");
			System.out.println("最も先頭のものはx[" + idxTop + "]にあります。");
			System.out.println("最も末尾のものはx[" + idxBtm + "]にあります。");
		}
	}

}
