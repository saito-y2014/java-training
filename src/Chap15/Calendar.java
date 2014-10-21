package Chap15;a

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Calendar {
	static int[] mday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	static int dayOfWeek(int year, int month, int day){
		if(month == 1 || month == 2){
			year--;
			month += 12;
		}
		return (year + year/4 - year/100 + year/400 + (13*month + 8) / 5 + day) % 7;
	}
	
	static boolean isLeap(int year){
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	
	static int monthDays(int year, int month){
		if(month-- != 2)
			return mday[month];
		return mday[month] + (isLeap(year) ? 1 : 0);
	}
	
	static void putCalendar(int year, int month){
		int wd = dayOfWeek(year, month, 1);
		int mdays = monthDays(year, month);
		
		System.out.println("　日　月　火　水　木　金　土　");
		System.out.println("----------------------");
		
		for(int i = 0; i < wd; i++)
			System.out.print("　 ");
		
		for(int i = 1; i <= mdays; i++){
			System.out.printf("%3d", i);
			if(++wd % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int year = 1, month = 1;
		
		if(args.length == 0){
			GregorianCalendar today = new GregorianCalendar();
			year = today.get(YEAR);
			month = today.get(MONTH)+ 1;
		}else{
			if(args.length >= 1){
				year = Integer.parseInt(args[0]);
				if(year < 0){
					System.out.println("年の指定が不正です。");
					return;
				}
			}
			if(args.length >= 2){
				month = Integer.parseInt(args[1]);
				if(month < 1 || month > 12){
					System.out.println("月の指定が不正です。");
					return;
				}
			}
		}
		if(args.length == 0 || args.length >= 2){
			System.out.printf("%d年%d月のカレンダー\n", year, month);
			putCalendar(year, month);
		}else{
			System.out.printf("%d年のカレンダー\n",year);
			for(month = 1; month <= 12; month++){
				System.out.printf("%d月\n", month);
				putCalendar(year, month);
				System.out.println();
			}
		}
	}

}