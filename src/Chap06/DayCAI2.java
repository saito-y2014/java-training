package Chap06;

import java.util.Random;
import java.util.Scanner;

public class DayCAI2 {
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
			
			int action;
			do {
				System.out.print(dayJapanese[day] + "曜日 :");
				String s = stdIn.next();
				
				if(s.equals(dayEnglish[day])){
					System.out.println("正解です。");
					break;
				}
				System.out.println("違います。");
				do {
					System.out.println("どうしますか？ 1・・・再入力 /0・・・正解を見る :");
					action = stdIn.nextInt();
				}while(action != 0 && action != 1);
				if(action == 0)
					System.out.println(dayJapanese[day] + "は\"" +
										dayEnglish[day] + "\"です。");
			}while(action == 1);
			
			System.out.print("もう一度？ 1・・・Yes / 0・・・No :");
			retry = stdIn.nextInt();
		}while(retry == 1);
	}

}
