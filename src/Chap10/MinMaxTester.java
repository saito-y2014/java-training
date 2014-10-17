package Chap10;

import java.util.Scanner;

public class MinMaxTester {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("x�̒l : "); int x = stdIn.nextInt();
		System.out.print("y�̒l : "); int y = stdIn.nextInt();
		System.out.print("z�̒l : "); int z = stdIn.nextInt();
		System.out.print("�z��a�̗v�f�� : ");
		int num = stdIn.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.printf("x, y�̍ŏ��l��%d�ł��B\n", MinMax.min(x, y));
		System.out.printf("x, y�̍ő�l��%d�ł��B\n", MinMax.max(x, y));
		
		System.out.printf("x, y, z�̍ŏ��l��%d�ł��B\n", MinMax.min(x, y, z));
		System.out.printf("x, y, z�̍ő�l��%d�ł��B\n", MinMax.max(x, y, z));
		
		System.out.printf("�z�ua�̍ŏ��l��%d�ł��B\n", MinMax.min(a));
		
		int xmin[] = MinMax.minIndexArray(a);
		System.out.print("���̃C���f�b�N�X��{ ");
		for(int i = 0; i < xmin.length; i++)
			System.out.print(xmin[i] + " ");
		System.out.println("}�ł��B");
		
		System.out.printf("�z��a�̍ő�l��%d�ł��B\n", MinMax.min(a));
		
		int xmax[] = MinMax.maxIndexArray(a);
		System.out.print("���̃C���f�b�N�X��{ ");
		for(int i = 0; i < xmax.length; i++)
			System.out.print(xmax[i] + " ");
		System.out.println("}�ł��B");
	}
}
