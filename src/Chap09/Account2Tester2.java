package Chap09;

import java.util.Scanner;

public class Account2Tester2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("����������͂���B");
		System.out.print("���@�` : ");
		String name = stdIn.next();
		System.out.print("�ԁ@�� : ");
		String no = stdIn.next();
		System.out.print("�c�@�� : ");
		long balance = stdIn.nextLong();
		System.out.print("�J�ݔN: "); int y = stdIn.nextInt();
		System.out.print("�J�݌�: "); int m = stdIn.nextInt();
		System.out.print("�J�ݓ�: "); int d = stdIn.nextInt();
		
		Account2 a = new Account2(name, no, balance, new Day(y, m, d));
		
		System.out.println("������{��� : " + a);
		System.out.println("�J�ݓ�: " + a.getOpenDay().toString());
	}

}
