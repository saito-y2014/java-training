package Chap05;

import java.util.Scanner;

public class Average3B {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�����l x��y��z�̕��ϒl�����߂܂��B");
		System.out.print("x�̒l :"); int x = stdIn.nextInt();
		System.out.print("y�̒l :"); int y = stdIn.nextInt();
		System.out.print("z�̒l :"); int z = stdIn.nextInt();
		
		double ave = (double)(x + y + z) / 3;
		System.out.printf("x��y��z�̕��ϒl��%.3f�ł��B \n", ave);
	}

}
