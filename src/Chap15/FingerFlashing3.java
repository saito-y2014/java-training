package Chap15;

import java.util.Scanner;

import Chap13.ComputerPlayer;
import Chap13.HumanPlayer;

public class FingerFlashing3 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp1 = new ComputerPlayer();
		ComputerPlayer cp2 = new ComputerPlayer();
		
		String[] hands = {"�O�[", "�`���L", "�p�["};
		int retry;
		
		do {
			int comp1 = cp1.nextHand();
			int comp2 = cp2.nextHand();
			
			int user = hp.nextHand();
			
			System.out.println("�R���s���[�^�P��" + hands[comp1] + "�ŁA" + "�R���s���[�^�Q��" + hands[comp2] + "�ŁA" + "���Ȃ���" + hands[user] + "�ł��B");
			
			int r1 = (user - comp1 + 3) % 3;
			int r2 = (user - comp2 + 3) % 3;
			
			if (r1 == 2 && r2 == 2)
				System.out.println("���Ȃ��̏����ł��B");
			else if(r1 == 1 && r2 == 0)
				System.out.println("�R���s���[�^�P�̏����ł��B");
			else if(r1 == 0 && r2 == 1)
				System.out.println("�R���s���[�^�Q�̏����ł��B");
			else if(r1 == 0 && r2 == 2)
				System.out.println("���Ȃ��ƃR���s���[�^�P�̏����ł��B");
			else if(r1 == 2 && r2 == 0)
				System.out.println("���Ȃ��ƃR���s���[�^�Q�̏����ł��B");
			else if(r1 == 1 && r2 == 1)
				System.out.println("�R���s���[�^�P�ƂQ�̏����ł��B");
			else
				System.out.println("�������ł��B");
			
			do{
				System.out.print("������x�H (0)������ (1)�͂� : ");
				retry = stdIn.nextInt();
			}while(retry != 0 && retry != 1);
		}while(retry == 1);
	}

}
