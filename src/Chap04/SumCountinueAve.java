package Chap04;

import java.util.Scanner;

public class SumCountinueAve {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂��� : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int count = 0;
		int i;
		for (i = 0; i < n; i++){
			System.out.print("���� : ");
			int t = stdIn.nextInt();
			if(t < 0){
				System.out.println("���̐��͉��Z���܂���B");
				continue;
			}
			sum += t;
			count++;
		}
		System.out.println("���v��" + sum + "�ł��B");
		if(count != 0)
			System.out.println("���ς�" + sum / count + "�ł��B");
	}

}
