package Chap04;

import java.util.Scanner;

public class SeasonRepeat {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int retry;
		
		System.out.println("季節を求めます。");
		do {
			int month;
			do {
				System.out.print("何月ですか：");
				month = stdIn.nextInt();
			}while (month < 1 || month > 12);
			
			if (month >= 3 && month <= 5)
				System.out.println("それは春です。");
			else if(month >= 6 && month <= 8)
				System.out.println("それは夏です。");
			else if(month >= 9 && month <= 11)
				System.out.println("それは秋です。");
			else if(month == 12 || month == 1 || month == 2)
				System.out.println("それは冬です。");
			
			System.out.print("もう一度？  1・・・Yes / 2・・・No :");
			retry = stdIn.nextInt();
		}while(retry == 1);
	}
}


