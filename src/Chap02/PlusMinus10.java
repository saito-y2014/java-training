package Chap02;

import java.util.Scanner;

public class PlusMinus10 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int x = stdIn.nextInt();
		
		System.out.println("10���������l��" + (x + 10) + "�ł��B");
		System.out.println("10���������l��" + (x - 10) + "�ł��B");
	}

}
