package Chap07;

import java.util.Scanner;

public class SumOf1 {
	static int sumOf(int[] a){
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f�� :");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("�S�v�f�̍��v��" + sumOf(x) + "�ł��B");
	}

}
