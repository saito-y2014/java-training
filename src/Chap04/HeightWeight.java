package Chap04;

import java.util.Scanner;

public class HeightWeight {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("何cmから：");
		int hMin = stdIn.nextInt();
		
		System.out.print("何cmまで：");
		int hMax = stdIn.nextInt();
		
		System.out.print("何cmごと：");
		int step = stdIn.nextInt();
		
		System.out.println("身長　標準体重");
		System.out.println("------------");
		
		for (int i = hMin; i <= hMax; i += step)
			System.out.println(i + " " + 0.9 * (i - 100));
	}

}
