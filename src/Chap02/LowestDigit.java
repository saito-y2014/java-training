package Chap02;

import java.util.Scanner;

public class LowestDigit {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int x = stdIn.nextInt();
		
		System.out.println("�ŉ��ʌ����������l��" + (x / 10) + "�ł��B");
		System.out.println("�ŉ��ʌ���" + (x % 10) + "�ł��B");
	}

}
