package Chap09;

import java.util.Scanner;

public class Account2Tester2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("口座情報を入力せよ。");
		System.out.print("名　義 : ");
		String name = stdIn.next();
		System.out.print("番　号 : ");
		String no = stdIn.next();
		System.out.print("残　高 : ");
		long balance = stdIn.nextLong();
		System.out.print("開設年: "); int y = stdIn.nextInt();
		System.out.print("開設月: "); int m = stdIn.nextInt();
		System.out.print("開設日: "); int d = stdIn.nextInt();
		
		Account2 a = new Account2(name, no, balance, new Day(y, m, d));
		
		System.out.println("口座基本情報 : " + a);
		System.out.println("開設日: " + a.getOpenDay().toString());
	}

}
