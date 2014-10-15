package Chap07;

import java.util.Scanner;

public class ArraySearchIndex {
	static int[] arraySrchIdx(int[] a, int x){
		int count = 0;
		for (int i = 0; i < a.length; i++)
			if(a[i] == x) count++;
		
		int[] c = new int[count--];
		for (int i = a.length - 1; count >= 0; i--)
			if(a[i] == x)
				c[count--] = i;
		return c;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f�� : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("�T������l : ");
		int n = stdIn.nextInt();
		
		int[] b = arraySrchIdx(x, n);
		
		if(b.length == 0)
			System.out.println("��v����v�f�͂���܂���B");
		else{
			System.out.println("��v����v�f�̃C���f�b�N�X");
			for(int i = 0; i < b.length; i++)
				System.out.println(b[i]);
		}
	}
	
}
