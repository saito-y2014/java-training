package Chap04;

import java.util.Scanner;

public class CountDown1 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�J�E���g�_�E�����܂��B");
		int x;
		do {
			System.out.print("���̐����l�F");
			x = stdIn.nextInt();
		} while(x <= 0);
		while(x >= 0){
			System.out.println(x);
			x--;
		}
		System.out.println("x�̒l��" + x + "�ɂȂ�܂����B");
	}

}
