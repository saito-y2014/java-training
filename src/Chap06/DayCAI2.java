package Chap06;

import java.util.Random;
import java.util.Scanner;

public class DayCAI2 {
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
			
			int action;
			do {
				System.out.print(dayJapanese[day] + "�j�� :");
				String s = stdIn.next();
				
				if(s.equals(dayEnglish[day])){
					System.out.println("�����ł��B");
					break;
				}
				System.out.println("�Ⴂ�܂��B");
				do {
					System.out.println("�ǂ����܂����H 1�E�E�E�ē��� /0�E�E�E���������� :");
					action = stdIn.nextInt();
				}while(action != 0 && action != 1);
				if(action == 0)
					System.out.println(dayJapanese[day] + "��\"" +
										dayEnglish[day] + "\"�ł��B");
			}while(action == 1);
			
			System.out.print("������x�H 1�E�E�EYes / 0�E�E�ENo :");
			retry = stdIn.nextInt();
		}while(retry == 1);
	}

}
