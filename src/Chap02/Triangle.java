package Chap02;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�O�p�`�̖ʐς����߂܂��B");
		
		System.out.print("��ӁF");
		double width = stdIn.nextDouble();
		
		System.out.print("�����F");
		double height = stdIn.nextDouble();
		
		System.out.println("�ʐς�" + (width * height / 2) + "�ł��B");
	}

}
