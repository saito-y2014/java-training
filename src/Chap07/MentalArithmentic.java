package Chap07;

import java.util.Random;
import java.util.Scanner;

public class MentalArithmentic {
	static Scanner stdIn = new Scanner(System.in);
	
	static boolean confirmRetry(){
		int cont;
		do {
			System.out.print("������x�H<Yes�E�E�E1 / No�E�E�E0 :");
			cont = stdIn.nextInt();
		}while(cont != 0 && cont != 1);
		return cont == 1;
	}
	
	public static void main(String[] args){
		Random rand = new Random();
		
		System.out.println("�ÎZ�̓g���[�j���O!!");
		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			int pattern = rand.nextInt(4);
			
			int kotae;
			switch (pattern){
			case 0  : kotae = x + y + z; break;
			case 1  : kotae = x + y - z; break;
			case 2  : kotae = x - y + z; break;
			default : kotae = x - y - z; break;
			}
			
			while(true){
				System.out.print(x + ((pattern < 2)       ? " + " : " - ")
						+ y + ((pattern % 2 == 0) ? " + " : " - ") + z + " = ");
				int  k = stdIn.nextInt();
				if(k == kotae)
					break;
				System.out.println("�Ⴂ�܂���!!");
			}
		}while(confirmRetry());
	}

}
