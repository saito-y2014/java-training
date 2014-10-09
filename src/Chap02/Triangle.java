package Chap02;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("三角形の面積を求めます。");
		
		System.out.print("底辺：");
		double width = stdIn.nextDouble();
		
		System.out.print("高さ：");
		double height = stdIn.nextDouble();
		
		System.out.println("面積は" + (width * height / 2) + "です。");
	}

}
