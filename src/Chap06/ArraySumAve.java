package Chap06;

import java.util.Scanner;

public class ArraySumAve {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�v�f�� :");
		
		int n = stdIn.nextInt();
		double[] a = new double[n];
		
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextDouble();
		}
		double sum = 0;
		for(double i : a)
			sum += i;
		
		System.out.println("�S�v�f�̍��v��" + sum + "�ł��B");
		System.out.println("�S�v�f�̕��ς�" + sum / n + "�ł��B");
	}

}
