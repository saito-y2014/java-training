package Chap02;

import java.util.Scanner;

public class SumDouble {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("x�̒l�F");
		double x = stdIn.nextDouble();
		
		System.out.print("y�̒l�F");
		double y = stdIn.nextDouble();
		
		System.out.println("���v��" + (x + y) + "�ł��B");
		System.out.println("���ς�" + (x + y) / 2 + "�ł��B");
	}

}
