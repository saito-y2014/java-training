package Chap06;

import java.util.Random;
import java.util.Scanner;

public class DayCAI1 {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] dayJapanese = {
				"��", "��", "��", "��", "��", "��", "�y"
		};
		String[] dayEnglish = {
				"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", 
				"saturday"
		};
		
		System.out.println("�p��̗j�������������œ��͂��Ă��������B");
		
		int retry;
		int last = -1;
		
		do {
			int day;
			do {
				day = rand.nextInt(7);
			}while(day == last);
			last = day;
			
			while(true){
				System.out.print(dayJapanese[day] + "�j�� :");
				String s = stdIn.next();
				
				if(s.equals(dayEnglish[day])) break;
				System.out.println("�Ⴂ�܂��B");
			}
			System.out.print("�����ł��B ������x�H 1�E�E�EYes / 2�E�E�ENo�@�F");
			retry = stdIn.nextInt();
		}while(retry == 1);
	
	}

}
