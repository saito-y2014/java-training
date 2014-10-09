package Chap03;

import java.util.Scanner;

public class Measure2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("•Ï”A:"); int a = stdIn.nextInt();
		System.out.print("•Ï”BF"); int b = stdIn.nextInt();
		
		if(!(a % b == 0))
			System.out.println("B‚ÍA‚Ì–ñ”‚Å‚Í‚ ‚è‚Ü‚¹‚ñB");
		else
			System.out.println("B‚ÍA‚Ì–ñ”‚Å‚·B");
	}

}
