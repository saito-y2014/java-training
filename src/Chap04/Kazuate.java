package Chap04;

import java.util.Random;
import java.util.Scanner;

public class Kazuate {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		final int MAX_NO = 6;
		int leftNo = MAX_NO;
		int no = rand.nextInt(100);
		
		System.out.println("�����ăQ�[���J�n!!");
		System.out.println("0�`99�̐��𓖂ĂĂ��������B");
		
		int x;
		do {
			System.out.print("�c��" + (leftNo--) + "��B �������� :");
			x = stdIn.nextInt();
			
			if(x > no)
				System.out.println("�����Ə����Ȑ�����B");
			else if(x < no)
				System.out.println("�����Ƒ傫�Ȑ�����B");
		}while(x != no && leftNo > 0);
		
		if(x == no)
			System.out.println((MAX_NO - leftNo) + "��œ�����܂����ˁB");
		else
			System.out.println("�c�O�B������" + no + "�ł����B");
	}

}
