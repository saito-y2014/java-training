package Chap04;

import java.util.Scanner;

public class SignRepeat {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		do{     //while��1�����͂�����do���������[�v����
			System.out.print("�����l�F");
			int n = stdIn.nextInt();
			
			if(n > 0)
				System.out.println("���̒l�͐��ł��B");
			else if(n < 0)
				System.out.println("���̒l�͕��ł��B");
			else
				System.out.println("���̒l�͂O�ł��B");
			
			System.out.print("������x�H 1�E�E�EYes/0�E�E�ENo :");
			retry = stdIn.nextInt();
		}while(retry == 1);
	}

}
