package Chap03;

import java.util.Scanner;

public class Sort2Descending {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�ϐ�a:"); int a = stdIn.nextInt();
		System.out.print("�ϐ�b:"); int b = stdIn.nextInt();
		
		if(a < b){         //a > b�̏ꍇ�͉������Ȃ��ł��̂܂ܕ\������
			int t = a;     //t�̒��Ɉ�Ua������
			a = b;         //a��b������
			b = t;		   //b�Ɍ���a������a��b�����ւ��Ă���
		}
		System.out.println("a��b�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("�ϐ�a��" + a + "�ł��B");
		System.out.println("�ϐ�b��" + b + "�ł��B");
		}

}
