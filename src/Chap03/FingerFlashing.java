package Chap03;

import java.util.Random;

public class FingerFlashing {
	public static void main(String[] args){
		Random rand = new Random();
		
		System.out.print("�R���s���[�^�Ő���������F");
		int hand = rand.nextInt(3);
		
		switch(hand){
			case 0: System.out.println("�O�["); break;
			case 1: System.out.println("�`���L"); break;
			case 2: System.out.println("�p�["); break;
		}
	}

}
