package Chap15;

import java.util.Scanner;

public class ScanStringRev {
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("������ : ");
	String s = stdIn.next();
	
	System.out.print("�t����ǂނ�");
	for(int i = s.length() - 1; i >= 0; i--)
		System.out.print(s.charAt(i));
	System.out.println("�ł��B");
	}

}
