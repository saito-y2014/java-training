package Chap06;

import java.util.Scanner;

public class PointTotalization {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		final int NINZU = 6;
		int[][] point = new int[NINZU][2];
		int[] sumStudent = new int[NINZU];
		int[] sumSubject = new int[2];
		
		System.out.printf("%d�l�̍���E���w�̓_������͂���B \n", NINZU);
		
		for(int i = 0; i < NINZU; i++){
			System.out.printf("%2d�ԁE�E�E���� :", i + 1);
			point[i][0] = stdIn.nextInt();
			System.out.print("�@�@�@�@     ���w :");
			point[i][1] = stdIn.nextInt();
			
			sumStudent[i] = point[i][0] + point[i][1];
			sumSubject[0] += point[i][0];
			sumSubject[1] += point[i][1];
		}
		
		System.out.println("No.  ����@���w�@����");
		for(int i = 0; i < NINZU; i++)
			System.out.printf("%2d%6d%6d%6.1f\n", i + 1, point[i][0], point[i][1],(double)sumStudent[i] / 2);
		System.out.printf("����%6.1f%6.1f\n", (double)sumSubject[0] / NINZU,(double)sumSubject[1] / NINZU);
	}

}
