package Chap10;

import java.util.Scanner;

public class MathMethods {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� : ");
		double x = stdIn.nextDouble();
		
		System.out.println("��Βl : " + Math.abs(x));
		System.out.println("������ : " + Math.sqrt(x));
		System.out.println(" �ʁ@�� : " + Math.PI * x * x);
	}

}
