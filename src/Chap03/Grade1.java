package Chap03;

import java.util.Scanner;

public class Grade1 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�_���F");
		int point = stdIn.nextInt();
		
		if(point >= 0 && point <= 59)
			System.out.println("�s��");
		else if(point >= 60 && point <= 69)
			System.out.println("��");
		else if(point >= 70 && point <= 79)
			System.out.println("��");
		else if(point >= 80 && point <= 100)
			System.out.println("�D");
		else
			System.out.println("�s���ȓ_���ł��B");
	}

}
