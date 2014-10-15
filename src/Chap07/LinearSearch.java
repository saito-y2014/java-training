package Chap07;

import java.util.Scanner;

public class LinearSearch {
	static int linearSearch(int[] a,int key){
		for(int i = 0; i < a.length; i++)
			if(a[i] == key)
				return i;
		return -1;
	}
	
	static int linearSearchR(int[] a, int key){
		for(int i = a.length - 1; i >= 0; i--)
			if(a[i] == key)
				return i;
		return -1;
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
		System.out.print("�T���l :");
		int ky = stdIn.nextInt();
		
		int idxTop = linearSearch( x, ky);
		int idxBtm = linearSearchR(x, ky);
		
		if(idxTop == -1)
			System.out.println("���̒l�̗v�f�͑��݂��܂���B");
		else if(idxTop == idxBtm)
			System.out.println("���̒l��x[" + idxTop + "]�ɂ���܂��B");
		else{
			System.out.println("���̒l�̗v�f�͕������݂��܂��B");
			System.out.println("�ł��擪�̂��̂�x[" + idxTop + "]�ɂ���܂��B");
			System.out.println("�ł������̂��̂�x[" + idxBtm + "]�ɂ���܂��B");
		}
	}

}
