package Chap10;

import java.util.Scanner;

public class AccountTester {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�J�݌����� : ");
		int n = stdIn.nextInt();
		Account[] a = new Account[n];
		
		for(int i = 0; i < a.length; i++){
			System.out.print("[0]�E�E�E�ȈՁ@[1]�E�E�E�ڍ� : ");
			int type = stdIn.nextInt();
			
			System.out.println("����������͂���B");
			System.out.print("���@�` : "); String name = stdIn.next();
			System.out.print("�ԁ@�� : "); String no = stdIn.next();
			if(type == 0)
				a[i] = new Account(name, no);
			else{
				System.out.print("�c�@�� : ");		int balance = stdIn.nextInt();
				System.out.print("�J�ݔN: ");		int y = stdIn.nextInt();
				System.out.print("�J�݌�: ");		int m = stdIn.nextInt();
				System.out.print("�J�ݓ�: ");		int d = stdIn.nextInt();
				a[i] = new Account(name, no, balance, new Day(y, m, d));
			}
			
			System.out.println("������{��� : " + a[i]);
			System.out.println("���ʔԍ� : " + a[i].getId());
			System.out.println("�J�ݓ� : " + a[i].getOpenDay().toString());
		}
	}

}
