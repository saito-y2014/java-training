package Chap06;

import java.util.Random;
import java.util.Scanner;

public class MonthCAI {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {
		   "January", "February", "March", "April", "May", "June", "July",
		   "August", "September", "October", "November", "December"
		};
		
		System.out.println("英語の月名を入力してください。");
		System.out.println("なお、先頭は大文字で、２文字目以降は小文字とします。");
		
		int retry;
		int last = -1;
		do {
			int month;
			do {
				month = rand.nextInt(12);
			}while (month == last);
			last = month;
			while(true){
				System.out.print((month + 1) + "月 :");
				String s = stdIn.next();
				
				if(s.equals(monthString[month])) break;
				System.out.println("違います。");
			}
			System.out.print("正解です。もう一度？ 1・・・Yes / 2・・・No :");
			retry = stdIn.nextInt();
		}while(retry == 1);
	}

}
