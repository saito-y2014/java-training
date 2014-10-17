package Chap10;

import java.util.Scanner;

public class DayTester {
	static Scanner stdIn = new Scanner(System.in);
	
	static void display(Day day){
		System.out.println(day + "�Ɋւ�����");
		System.out.println("�[�N" + (day.isLeap() ? "�ł���B" : "�ł͂Ȃ��B"));
		System.out.println("�N���o�ߓ��� : " + day.dayOfYear());
		System.out.println("�N���c����� : " + day.leftDayOfYear());
	}
	
	static void change(Day day){
		System.out.println("[1]�N������ύX�@[2]�N��ύX");
		System.out.println("[3]����ύX�@�@�@�@[4]����ύX");
		System.out.println("[5]1���i�߂�@�@�@  [6]1���߂�");
		System.out.print(  "[7]n���i�߂�@�@�@  [8]n���߂�");
		
		int change = stdIn.nextInt();
		int y = 0, m = 0, d = 0, n = 0;
		
		if(change == 1 || change == 2){
			System.out.print("�N : ");		y = stdIn.nextInt();
		}
		if(change == 1 || change == 3){
			System.out.print("�� : ");		m = stdIn.nextInt();
		}
		if(change == 1 || change == 4){
			System.out.print("�� : ");		d = stdIn.nextInt();
		}
		if(change == 7 || change == 8){
			System.out.print("���� : ");		n = stdIn.nextInt();
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
		System.out.println(day + "�ɍX�V����܂����B");
	}
	
	static void compare(Day day){
		System.out.println("��r�Ώۂ̓��t����͂���B");
		System.out.print("�N : ");	int y = stdIn.nextInt();
		System.out.print("�� : ");	int m = stdIn.nextInt();
		System.out.print("�� : ");	int d = stdIn.nextInt();
		
		Day d2 = new Day(y, m, d);
		
		int comp = day.compareTo(d2);
		System.out.print(day);
		switch(comp){
		case -1: System.out.println("�̂ق����O�B");	break;
		case  1: System.out.println("�̂ق�����B");	break;
		case  0: System.out.println("�Ɠ����B");		break;
		}
	}
	
	static void beforeAfter(Day day){
		System.out.print("[1]�����@[2]�O���@[3]n����@[4]n���O : ");
		int type = stdIn.nextInt();
		int n = 0;
		if(type == 3 || type == 4){
			System.out.print("���� : ");		n = stdIn.nextInt();
		}
		
		System.out.print("�����");
		switch(type){
		case 1: System.out.print(day.succeedingDay());		break;
		case 2: System.out.print(day.precedingDay());		break;
		case 3: System.out.print(day.after(n));				break;
		case 4: System.out.print(day.before(n));			break;
		}
		System.out.println("�ł��B");
	}
	
	public static void main(String[] args){
		System.out.println("���t����͂���B");
		System.out.print("�N : ");	int y = stdIn.nextInt();
		System.out.print("�� : ");	int m = stdIn.nextInt();
		System.out.print("�� : ");	int d = stdIn.nextInt();
		
		Day day = new Day(y, m, d);
		
		while (true){
			System.out.print(
					"[1]���t�Ɋւ������\���@[2]���t��ύX�@[3]���̓��t�Ƃ̔�r\n" + "[4]�O��̓��t�����߂�@[5]�I�� : ");
			
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
