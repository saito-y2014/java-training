package Chap02;

import java.util.Scanner;

public class Greeting {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���F"); String firstName = stdIn.next();
		System.out.print("���F"); String lastName = stdIn.next();
		
		System.out.println("����ɂ���" + firstName + lastName + "����B");
	}

}
