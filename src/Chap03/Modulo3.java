package Chap03;

import java.util.Scanner;

public class Modulo3 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		if(n > 0)
			if(n % 3 == 0)
				System.out.println("���̒l�͂R�Ŋ���؂�܂��B");
			else if(n % 3 == 1)
				System.out.println("���̒l���R�Ŋ������]���1�ł��B");
			else
				System.out.println("���̒l���R�Ŋ������]��͂Q�ł��B");
		else
			System.out.println("���łȂ��l�����͂���܂����B");
				
	}

}
