package Chap13;

import java.util.Scanner;

public class FingerFlashing {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp = new ComputerPlayer();
		
		String[] hands = {"�O�[", "�`���L", "�p�["};
		
		int retry;
		
		do{
			int comp = cp.nextHand();
			
			int user = hp.nextHand();
			
			System.out.println("����" + hands[comp] + "�ŁA���Ȃ���" + hands[user] + "�ł��B");
			
			int judge = (user - comp + 3) % 3;
			switch (judge){
				case 0 : System.out.println("���������ł��B");		break;
				case 1 : System.out.println("���Ȃ��̕����ł��B");	break;
				case 2 : System.out.println("���Ȃ��̏����ł��B");	break;
			}
			
			do {
				System.out.print("������x�H (0)������ (1)�͂� : ");
				retry = stdIn.nextInt();
			}while(retry != 0 && retry != 1);
		}while(retry == 1);
	}

}
