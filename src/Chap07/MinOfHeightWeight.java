package Chap07;

import java.util.Scanner;

public class MinOfHeightWeight {
	static int minOf(int[] a){
		int min = a[0];
		for(int i = 1; i < a.length; i++)
			if(a[i] < min)
				min = a[i];
		return min;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�l���� :");
		int ninzu = stdIn.nextInt();
		
		int[] height = new int[ninzu];
		int[] weight = new int[ninzu];
		
		System.out.println(ninzu + "�l�̐g���Ƒ̏d����͂���B");
		
		for(int i = 0; i < ninzu; i++){
			System.out.print((i + 1) + "�Ԗڂ̐g�� :");
			height[i] = stdIn.nextInt();
			System.out.print((i + 1) + "�Ԗڂ̑̏d :");
			weight[i] = stdIn.nextInt();
		}
		
		System.out.println("�ł��w���Ⴂ�l�̐g�� :" + minOf(height) + "cm");
		System.out.println("�ł������Ă���l�̑̏d :" + minOf(weight) + "kg");
	}

}
