package Chap04;

import java.util.Scanner;

public class IsoscelesTriangleLU {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���㒼�p�̓񓙕ӎO�p�`��\�����܂��B");
		System.out.print("�i���� : ");
		int n = stdIn.nextInt();
		
		for(int i = 1;i <= n; i++){
			for(int j = 1; j <= n - i + 1; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}