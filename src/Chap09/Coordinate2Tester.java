package Chap09;

import java.util.Scanner;

public class Coordinate2Tester {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("座標pを入力せよ。");
		System.out.print("X座標 : ");
		double x = stdIn.nextDouble();
		System.out.print("Y座標 : ");
		double y = stdIn.nextDouble();
	
		Coordinate2 p = new Coordinate2(x, y);
		System.out.println("p = " + p);
	
		Coordinate2 q = new Coordinate2(p);
	
		System.out.println("qをpと同じ座標として作りました。");
		System.out.println("q = " + q);
	
		if(p.equalTo(q))
			System.out.println("pとqは等しいです。");
		else
			System.out.println("pとqは等しくありません。");
		
		Coordinate2 c1 = new Coordinate2();
		Coordinate2 c2 = new Coordinate2(1.1, 2.2);
		
		System.out.println("c1   = " + c1);
		System.out.println("c2   = " + c2);
		
		Coordinate2[] a = new Coordinate2[3];
		for (int i = 0; i < a.length; i++)
			a[i] = new Coordinate2();
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	
	}
}