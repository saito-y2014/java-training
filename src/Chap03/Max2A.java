package Chap03;

import java.util.Scanner;

public class Max2A {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数値a："); double a = stdIn.nextDouble();
		System.out.print("実数値b："); double b = stdIn.nextDouble();
		
		double max;
		if(a > b)
			max = a;
		else
			max = b;
		
		System.out.println("大きいほうの値は" + max + "です。");	
	}

}
