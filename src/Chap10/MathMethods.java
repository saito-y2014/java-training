package Chap10;

import java.util.Scanner;

public class MathMethods {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("À” : ");
		double x = stdIn.nextDouble();
		
		System.out.println("â‘Î’l : " + Math.abs(x));
		System.out.println("•½•ûª : " + Math.sqrt(x));
		System.out.println(" –Ê@Ï : " + Math.PI * x * x);
	}

}
