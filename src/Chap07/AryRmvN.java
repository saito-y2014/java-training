package Chap07;

import java.util.Scanner;

public class AryRmvN {
	static void aryRmvN(int[] a, int idx, int n){
		if(n > 0 && idx >= 0 && idx + n < a.length){
			int idx2 = idx + n - 1;
			if(idx2 > a.length - n - 1)
				idx2 = a.length - n - 1;
			for(int i = idx; i <= idx2; i++)
				a[i] = a[i + n];
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f�� : ");
		int num = stdIn.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("�폜����J�n�C���f�b�N�X : ");
		int idx = stdIn.nextInt();
		
		System.out.print("�폜����v�f�̌� : ");
		int n = stdIn.nextInt();
		
		aryRmvN(a, idx, n);
		
		for(int i = 0; i < num; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
