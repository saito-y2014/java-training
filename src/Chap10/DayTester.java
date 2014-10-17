package Chap10;

import java.util.Scanner;

public class DayTester {
	static Scanner stdIn = new Scanner(System.in);
	
	static void display(Day day){
		System.out.println(day + "に関する情報");
		System.out.println("閏年" + (day.isLeap() ? "である。" : "ではない。"));
		System.out.println("年内経過日数 : " + day.dayOfYear());
		System.out.println("年内残り日数 : " + day.leftDayOfYear());
	}
	
	static void change(Day day){
		System.out.println("[1]年月日を変更　[2]年を変更");
		System.out.println("[3]月を変更　　　　[4]日を変更");
		System.out.println("[5]1日進める　　　  [6]1日戻す");
		System.out.print(  "[7]n日進める　　　  [8]n日戻す");
		
		int change = stdIn.nextInt();
		int y = 0, m = 0, d = 0, n = 0;
		
		if(change == 1 || change == 2){
			System.out.print("年 : ");		y = stdIn.nextInt();
		}
		if(change == 1 || change == 3){
			System.out.print("月 : ");		m = stdIn.nextInt();
		}
		if(change == 1 || change == 4){
			System.out.print("日 : ");		d = stdIn.nextInt();
		}
		if(change == 7 || change == 8){
			System.out.print("何日 : ");		n = stdIn.nextInt();
		}
		
		switch(change){
		case 1: day.set(y, m, d);		break;
		case 2: day.setYear(y);			break;
		case 3: day.setMonth(m);		break;
		case 4: day.setDate(d);			break;
		case 5: day.succeed();			break;
		case 6: day.precede();			break;
		case 7: day.succeedDays(n);		break;
		case 8: day.precedeDays(n);		break;
		}
		System.out.println(day + "に更新されました。");
	}
	
	static void compare(Day day){
		System.out.println("比較対象の日付を入力せよ。");
		System.out.print("年 : ");	int y = stdIn.nextInt();
		System.out.print("月 : ");	int m = stdIn.nextInt();
		System.out.print("日 : ");	int d = stdIn.nextInt();
		
		Day d2 = new Day(y, m, d);
		
		int comp = day.compareTo(d2);
		System.out.print(day);
		switch(comp){
		case -1: System.out.println("のほうが前。");	break;
		case  1: System.out.println("のほうが後。");	break;
		case  0: System.out.println("と同じ。");		break;
		}
	}
	
	static void beforeAfter(Day day){
		System.out.print("[1]翌日　[2]前日　[3]n日後　[4]n日前 : ");
		int type = stdIn.nextInt();
		int n = 0;
		if(type == 3 || type == 4){
			System.out.print("何日 : ");		n = stdIn.nextInt();
		}
		
		System.out.print("それは");
		switch(type){
		case 1: System.out.print(day.succeedingDay());		break;
		case 2: System.out.print(day.precedingDay());		break;
		case 3: System.out.print(day.after(n));				break;
		case 4: System.out.print(day.before(n));			break;
		}
		System.out.println("です。");
	}
	
	public static void main(String[] args){
		System.out.println("日付を入力せよ。");
		System.out.print("年 : ");	int y = stdIn.nextInt();
		System.out.print("月 : ");	int m = stdIn.nextInt();
		System.out.print("日 : ");	int d = stdIn.nextInt();
		
		Day day = new Day(y, m, d);
		
		while (true){
			System.out.print(
					"[1]日付に関する情報を表示　[2]日付を変更　[3]他の日付との比較\n" + "[4]前後の日付を求める　[5]終了 : ");
			
			int menu = stdIn.nextInt();
			if(menu == 5) break;
			
			switch(menu){
			case 1: display(day);		break;
			case 2: change(day);		break;
			case 3: compare(day);		break;
			case 4: beforeAfter(day);	break;
			}
		}
	}
}
