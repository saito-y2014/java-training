package Chap05;

import java.util.Scanner;

public class Average3A {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�����lx��y��z�̕��ϒl�����߂܂��B");
		System.out.print("x�̒l :"); int x = stdIn.nextInt();
		System.out.print("y�̒l :"); int y = stdIn.nextInt();
		System.out.print("z�̒l :"); int z = stdIn.nextInt();
		
		double ave = (x + y + z) / 3.0;
		System.out.printf("x��y�̕��ϒl��%.3f�ł��B \n", ave);
	}

}
