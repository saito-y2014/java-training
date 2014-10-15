package Chap07;

import java.util.Scanner;

public class Min {
	static int min(int a, int b){
		return a < b ? a : b;
	}
	
	static int min(int a, int b, int c){
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
	
	static int min(int[] a){
		int min = a[0];
		for(int i = 1; i < a.length; i++)
			if(a[i] < min)
				min = a[i];
		return min;
	}
	
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
		
		System.out.println("x, y�̍ŏ��l��" + min(x, y) + "�ł��B");
		
		System.out.println("x, y, z�̍ŏ��l��" + min(x, y, z) + "�ł��B");
		
		System.out.println("�z��a�̍ŏ��l��" + min(a) + "�ł��B");
	}

}
