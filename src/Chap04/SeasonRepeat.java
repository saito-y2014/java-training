package Chap04;

import java.util.Scanner;

public class SeasonRepeat {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int retry;
		
		System.out.println("�G�߂����߂܂��B");
		do {
			int month;
			do {
				System.out.print("�����ł����F");
				month = stdIn.nextInt();
			}while (month < 1 || month > 12);
			
			if (month >= 3 && month <= 5)
				System.out.println("����͏t�ł��B");
			else if(month >= 6 && month <= 8)
				System.out.println("����͉Ăł��B");
			else if(month >= 9 && month <= 11)
				System.out.println("����͏H�ł��B");
			else if(month == 12 || month == 1 || month == 2)
				System.out.println("����͓~�ł��B");
			
			System.out.print("������x�H  1�E�E�EYes / 2�E�E�ENo :");
			retry = stdIn.nextInt();
		}while(retry == 1);
	}
}


