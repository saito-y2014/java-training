package Chap03;

import java.util.Scanner;

public class GoInto5 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		if(n > 0)
			if(n % 5 == 0)
				System.out.println("���̒l�͂T�Ŋ���؂�܂��B");
			else
				System.out.println("���̒l�͂T�Ŋ��肫��܂���B");
		else
			System.out.println("���łȂ��l�����͂���܂����B");
	}

}
