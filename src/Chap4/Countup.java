package Chap4;

import java.util.Scanner;

public class Countup {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�J�E���g�A�b�v���܂��B");
		
		int x;
		do {
			System.out.print("���̐����l�F");
			x = stdIn.nextInt();
		}while(x <= 0);
		
		for(int i = 0; i <= x; i++)
			System.out.println(i);
	}

}
