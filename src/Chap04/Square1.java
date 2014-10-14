package Chap04;

import java.util.Scanner;

public class Square1 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n‚Ì’lF");
		int n = stdIn.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.println(i + "‚Ì‚Qæ‚Í" + i * i);
		}
	}

}
