package Chap11;

import java.util.GregorianCalendar;
import java.util.Random;

public class Omikuji1 {
	
	public static void main(String[] args){
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(GregorianCalendar.YEAR);
		int m = today.get(GregorianCalendar.MONTH) + 1;
		int d = today.get(GregorianCalendar.DATE);
		System.out.printf("������%04d�N%02d��%02d���ł��B\n", y, m, d);
		
		Random rand = new Random();
		int k = rand.nextInt(10);
		System.out.print("�����̉^����");
		switch(k){
		case 0 :							System.out.print("��g");	break;
		case 1 : case 2 : case 3 :			System.out.print("�g");		break;
		case 4 : case 5 : case 6 :			System.out.print("���g");	break;
		case 7 : case 8 :					System.out.print("���g");	break;
		case 9 :							System.out.print("��");		break;
		}
		System.out.println("�ł��B");
	}

}
