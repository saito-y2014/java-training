package Chap03;

import java.util.Scanner;

public class Sort3 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�ϐ�a�F"); int a = stdIn.nextInt();
		System.out.print("�ϐ�b�F"); int b = stdIn.nextInt();
		System.out.print("�ϐ�c�F"); int c = stdIn.nextInt();
		
		if(a > b){
			int t = a; a = b; b = t;
		}
		if(b > c){
			int t = b; b = c; c = t;
		}
		if(a > b){
			int t = a; a = b; b = t;
		}
		
		System.out.println("a��b��c�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("�ϐ�a��" + a + "�ł��B");
		System.out.println("�ϐ�b��" + b + "�ł��B");
		System.out.println("�ϐ�c��" + c + "�ł��B");
	}

}
