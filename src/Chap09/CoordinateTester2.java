package Chap09;

import java.util.Scanner;

public class CoordinateTester2 {
	static boolean compCoordinate(Coordinate c1, Coordinate c2){
		return c1.getX() == c2.getX() && c1.getY() == c2.getY();
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		double x, y;
		System.out.println("���Wp����͂���B");
		System.out.print("X���W : "); x = stdIn.nextDouble();
		System.out.print("Y���W : "); y = stdIn.nextDouble();
		Coordinate p = new Coordinate(x, y);
		
		System.out.println("���Wq����͂���B");
		System.out.print("�����W : "); x = stdIn.nextDouble();
		System.out.print("Y���W : "); y = stdIn.nextDouble();
		Coordinate q = new Coordinate(x, y);
		
		System.out.println((p == q) ? "p == q�ł��B" : "p != q�ł��B");
		
		System.out.println(p.getX() == q.getX() && p.getY() == q.getY() ? "p��q�͓������ł��B" : "p��q�͓���������܂���B");
		
		System.out.println(compCoordinate(p, q) ? "p��q�͓������ł��B" : "p��q�͓���������܂���B");
	}

}
