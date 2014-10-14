package Chap06;

import java.util.Random;
import java.util.Scanner;

public class DayCAI1 {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] dayJapanese = {
				"日", "月", "火", "水", "木", "金", "土"
		};
		String[] dayEnglish = {
				"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", 
				"saturday"
		};
		
		System.out.println("英語の曜日名を小文字で入力してください。");
		
		int retry;
		int last = -1;
		
		do {
			int day;
			do {
				day = rand.nextInt(7);
			}while(day == last);
			last = day;
			
			while(true){
				System.out.print(dayJapanese[day] + "曜日 :");
				String s = stdIn.next();
				
				if(s.equals(dayEnglish[day])) break;
				System.out.println("違います。");
			}
			System.out.print("正解です。 もう一度？ 1・・・Yes / 2・・・No　：");
			retry = stdIn.nextInt();
		}while(retry == 1);
	
	}

}
