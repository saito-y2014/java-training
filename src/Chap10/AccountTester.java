package Chap10;

import java.util.Scanner;

public class AccountTester {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("開設口座数 : ");
		int n = stdIn.nextInt();
		Account[] a = new Account[n];
		
		for(int i = 0; i < a.length; i++){
			System.out.print("[0]・・・簡易　[1]・・・詳細 : ");
			int type = stdIn.nextInt();
			
			System.out.println("口座情報を入力せよ。");
			System.out.print("名　義 : "); String name = stdIn.next();
			System.out.print("番　号 : "); String no = stdIn.next();
			if(type == 0)
				a[i] = new Account(name, no);
			else{
				System.out.print("残　高 : ");		int balance = stdIn.nextInt();
				System.out.print("開設年: ");		int y = stdIn.nextInt();
				System.out.print("開設月: ");		int m = stdIn.nextInt();
				System.out.print("開設日: ");		int d = stdIn.nextInt();
				a[i] = new Account(name, no, balance, new Day(y, m, d));
			}
			
			System.out.println("口座基本情報 : " + a[i]);
			System.out.println("識別番号 : " + a[i].getId());
			System.out.println("開設日 : " + a[i].getOpenDay().toString());
		}
	}

}
