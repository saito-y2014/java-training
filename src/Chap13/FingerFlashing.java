package Chap13;

import java.util.Scanner;

public class FingerFlashing {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp = new ComputerPlayer();
		
		String[] hands = {"グー", "チョキ", "パー"};
		
		int retry;
		
		do{
			int comp = cp.nextHand();
			
			int user = hp.nextHand();
			
			System.out.println("私は" + hands[comp] + "で、あなたは" + hands[user] + "です。");
			
			int judge = (user - comp + 3) % 3;
			switch (judge){
				case 0 : System.out.println("引き分けです。");		break;
				case 1 : System.out.println("あなたの負けです。");	break;
				case 2 : System.out.println("あなたの勝ちです。");	break;
			}
			
			do {
				System.out.print("もう一度？ (0)いいえ (1)はい : ");
				retry = stdIn.nextInt();
			}while(retry != 0 && retry != 1);
		}while(retry == 1);
	}

}
