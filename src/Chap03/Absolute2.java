package Chap03;

import java.util.Scanner;

public class Absolute2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		int abs;
		if(n >= 0)
			abs = n;
		else
			abs = -n;
		System.out.println("���̐�Βl��" + abs + "�ł��B");	
	}

}
