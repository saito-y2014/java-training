package Chap07;

import java.util.Scanner;

public class PrintArray {
	static void printArray(int[] a){
		for(int i = 0; i < a.length - 1; i++)
			System.out.print(a[i] + " ");
		System.out.print(a[a.length - 1]);
		System.out.println();
	}
	
	static void printArray(int[][] a){
		int[][] width = new int[a.length][];
		int max = 0;
		for (int i = 0; i < a.length; i++){
			width[i] = new int[a[i].length];
			if(a[i].length > max)
				max = a[i].length;
		}
		int[] maxWidth = new int[max];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				int value = a[i][j];
				width[i][j] = (value < 0) ? 1 : 0;
				do {
					width[i][j]++;
					value /= 10;
				}while(value != 0);
				if(width[i][j] > maxWidth[j])
					maxWidth[j] = width[i][j];
			}
		}
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length - 1; j++){
				System.out.print(a[i][j]);
				for(int k = 0; k <= maxWidth[j] - width[i][j]; k++)
					System.out.print(' ');
			}
			System.out.println(a[i][a[i].length -1]);
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("‚PŽŸŒ³”z—ñx‚Ì—v‘f” : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
			
		System.out.print("‚QŽŸŒ³”z—ñy‚Ìs” : ");
		int height = stdIn.nextInt();
		int[][] y = new int[height][];
		for(int i = 0; i < y.length; i++){
			System.out.print(i + "s–Ú‚Ì—ñ” : ");
			int width = stdIn.nextInt();
			y[i] = new int[width];
		}
			
		System.out.println("Še—v‘f‚Ì’l‚ð“ü—Í‚¹‚æB");
		for(int i = 0; i < y.length; i++){
			for(int j = 0; j < y[i].length; j++){
				System.out.printf("y[%d][%d] : ", i, j);
				y[i][j] = stdIn.nextInt();
			}
		}
		
		System.out.println("\n‚PŽŸŒ³”z—ñ‚˜");
		printArray(x);
		
		System.out.println("\n‚QŽŸŒ³”z—ñ‚™");
		printArray(y);
	}
}

