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
		
		System.out.println("�p��̌�������͂��Ă��������B");
		System.out.println("�Ȃ��A�擪�͑啶���ŁA�Q�����ڈȍ~�͏������Ƃ��܂��B");
		
		int retry;
		int last = -1;
		do {
			int month;
			do {
				month = rand.nextInt(12);
			}while (month == last);
			last = month;
			while(true){
				System.out.print((month + 1) + "�� :");
				String s = stdIn.next();
				
				if(s.equals(monthString[month])) break;
				System.out.println("�Ⴂ�܂��B");
			}
			System.out.print("�����ł��B������x�H 1�E�E�EYes / 2�E�E�ENo :");
			retry = stdIn.nextInt();
		}while(retry == 1);
	}

}
