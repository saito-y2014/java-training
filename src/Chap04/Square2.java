package Chap04;

import java.util.Scanner;

public class Square2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n‚Ì’lF");
		int n = stdIn.nextInt();
		
		for (int i = 1, j = 1; i <= n; i++, j = i * i){
			System.out.println(i + "‚Ì‚Qæ‚Í" + j);
		}
	}

}
