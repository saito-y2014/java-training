package Chap4;

import java.util.Random;
import java.util.Scanner;

public class Kazuate2digits {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = 10 + rand.nextInt(90);
		System.out.println("�����ăQ�[���J�n!!");
		System.out.println("10�`99�̐��𓖂ĂĂ��������B");
		
		int x;
		do{
			System.out.print("�������ȁF");
			x = stdIn.nextInt();
			
			if(x > no)
				System.out.println("�����Ə�����������B");
			else if(x < no)
				System.out.println("�����Ƒ傫��������B");
		}while(x != no);
		//(x < no)(x > no)�łȂ��ꍇ
		System.out.println("�����ł��I");
	}

}
