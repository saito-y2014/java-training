package Chap07;

import java.util.Scanner;

public class AryIns {
	static void aryIns(int[] a, int idx, int x){
		if(idx >= 0 && idx < a.length){
			for(int i = a.length - 1; i > idx; i--)
				a[i] = a[i - 1];
			a[idx] = x;
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
		
		System.out.print("�}������v�f�̃C���f�b�N�X : ");
		int idx = stdIn.nextInt();
		
		System.out.print("�}������l : ");
		int x = stdIn.nextInt();
		
		aryIns(a, idx, x);
		
		for(int i = 0; i < num; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
