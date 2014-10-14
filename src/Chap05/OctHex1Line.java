package Chap05;

import java.util.Scanner;

public class OctHex1Line {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®” :");
		int x = stdIn.nextInt();
		
		System.out.printf("8i”‚Å‚Í%o‚Å16i”‚Å‚Í%x‚Å‚·B \n", x, x);
	}

}
