package Chap06;

import java.util.Scanner;

public class UnevennessArray {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�ʉ��ȂQ�����z������܂��B");
		System.out.print("�s�� :");
		int height = stdIn.nextInt();
		
		int[][] c = new int[height][];
		
		for (int i = 0; i < c.length; i++){
			System.out.println(i + "�s�ڂ̗� :");
			int width = stdIn.nextInt();
			c[i] = new int[width];
		}
		
		System.out.println("�e�v�f�̒l����͂���B");
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j++){
				System.out.printf("c[%d][%d] :", i, j);
				c[i][j] = stdIn.nextInt();
			}
		}
		System.out.println("�z��c�̊e�v�f�̒l�͎��̂悤�ɂȂ��Ă��܂��B");
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j ++)
				System.out.printf("%3d", c[i][j]);
			System.out.println();	
			
		}
	}

}
