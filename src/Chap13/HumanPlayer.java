package Chap13;

import java.util.Scanner;

public class HumanPlayer extends Player {
	private static Scanner stdIn;
	
	static {
		stdIn = new Scanner(System.in);
	}
	
	public int nextHand(){
		do {
			System.out.print("����񂯂�|��!!  0�E�E�E�O�[�^1�E�E�E�`���L�^2�E�E�E�p�[ : ");
			hand = stdIn.nextInt();
		} while(hand < 0 || hand > 2);
		return hand;
	}

}
