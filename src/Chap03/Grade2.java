package Chap03;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�_���F");
		int point = stdIn.nextInt();
		
		if(point < 0 || point > 100)
			System.out.println("�s���ȓ_���ł��B");
		else if(point <= 59)
			System.out.println("�s��");
		else if(point <= 69)
			System.out.println("��");
		else if(point <= 79)
			System.out.println("��");
		else
			System.out.println("�D");
	}

}
