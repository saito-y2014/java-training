package Chap06;

import java.util.Scanner;

public class PointClass {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�N���X�� :");
		int classNum = stdIn.nextInt();
		
		int[][] point = new int[classNum][];
		
		int ninzu = 0;
		for(int i = 0; i < point.length; i++){
			System.out.printf("\n%d�g�̐l�� :", i + 1);
			int num = stdIn.nextInt();
			point[i] = new int[num];
			ninzu += num;
			for (int j = 0; j < point[i].length; j++){
				System.out.printf("%d�g%d�Ԃ̓_�� :", i + 1, j + 1);
				point[i][j] = stdIn.nextInt();
			}
		}
		
		System.out.println("�@�@�g  |�@�@�@���v�@�@ ����");
		System.out.println("-----+---------------");
		int total = 0;
		for(int i = 0; i < point.length; i++){
			int sum = 0;
			for(int j = 0; j < point[i].length; j++)
				sum += point[i][j];
			total += sum;
			System.out.printf("%2d�g�@|%7d%7.1f\n", i + 1, sum, (double)sum / point[i].length);
		}
		System.out.println("-----+---------------");
		System.out.printf("�@�@�v  |%7d%7.1f\n", total, (double)total / ninzu);
	}

}
