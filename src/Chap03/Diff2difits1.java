package Chap03;

import java.util.Scanner;

public class Diff2difits1 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:"); int a = stdIn.nextInt();
		System.out.print("整数b："); int b = stdIn.nextInt();
		
		int diff = a >= b ? a - b : b - a;
		
		if(diff <= 10)
			System.out.println("それらの差は10以下です。");
		else
			System.out.println("それらの差は11以上です。");
		
	}

}
