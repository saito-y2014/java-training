package Chap06;

import java.util.Scanner;

public class LinearSearchTop {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f�� :");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int j = 0; j < n; j++){
			System.out.print("a[" + j + "] = ");
			a[j] = stdIn.nextInt();
		}
		
		System.out.print("�T�����l :");
		int key = stdIn.nextInt();
		
		int i;
		for(i = 0; i < n; i++)
			if(a[i] == key)
				break;
		
		if(i < n)
			System.out.print("�����a[" + i + "]�ɂ���܂��B");
		else
			System.out.print("����͂���܂���B");
	}

}
