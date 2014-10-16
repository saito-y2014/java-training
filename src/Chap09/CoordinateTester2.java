package Chap09;

import java.util.Scanner;

public class CoordinateTester2 {
	static boolean compCoordinate(Coordinate c1, Coordinate c2){
		return c1.getX() == c2.getX() && c1.getY() == c2.getY();
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		double x, y;
		System.out.println("座標pを入力せよ。");
		System.out.print("X座標 : "); x = stdIn.nextDouble();
		System.out.print("Y座標 : "); y = stdIn.nextDouble();
		Coordinate p = new Coordinate(x, y);
		
		System.out.println("座標qを入力せよ。");
		System.out.print("ｘ座標 : "); x = stdIn.nextDouble();
		System.out.print("Y座標 : "); y = stdIn.nextDouble();
		Coordinate q = new Coordinate(x, y);
		
		System.out.println((p == q) ? "p == qです。" : "p != qです。");
		
		System.out.println(p.getX() == q.getX() && p.getY() == q.getY() ? "pとqは等しいです。" : "pとqは等しくありません。");
		
		System.out.println(compCoordinate(p, q) ? "pとqは等しいです。" : "pとqは等しくありません。");
	}

}
