package Chap09;

import java.util.Scanner;

public class CoordinateTester1 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("座標pを入力せよ。");
		System.out.print("X座標 : "); double x = stdIn.nextDouble();
		System.out.print("Y座標 : "); double y = stdIn.nextDouble();
	
		Coordinate p = new Coordinate(x, y);
		System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");
	
		Coordinate q = p;
		q.set(9.9, 9.9);
	
		System.out.println("p = {" + p.getX() + ", " + p.getY() + ")");
		System.out.println("q = (" + q.getX() + ", " + q.getY() + ")");
	}
}