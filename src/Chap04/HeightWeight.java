package Chap04;

import java.util.Scanner;

public class HeightWeight {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��cm����F");
		int hMin = stdIn.nextInt();
		
		System.out.print("��cm�܂ŁF");
		int hMax = stdIn.nextInt();
		
		System.out.print("��cm���ƁF");
		int step = stdIn.nextInt();
		
		System.out.println("�g���@�W���̏d");
		System.out.println("------------");
		
		for (int i = hMin; i <= hMax; i += step)
			System.out.println(i + " " + 0.9 * (i - 100));
	}

}
