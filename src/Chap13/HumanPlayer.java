package Chap13;

import java.util.Scanner;

public class HumanPlayer extends Player {
	private static Scanner stdIn;
	
	static {
		stdIn = new Scanner(System.in);
	}
	
	public int nextHand(){
		do {
			System.out.print("じゃんけんポン!!  0・・・グー／1・・・チョキ／2・・・パー : ");
			hand = stdIn.nextInt();
		} while(hand < 0 || hand > 2);
		return hand;
	}

}
