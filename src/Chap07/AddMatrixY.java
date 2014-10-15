package Chap07;

import java.util.Scanner;

public class AddMatrixY {
	static int[][] addMatrix(int[][] x, int[][] y){
		int[][] z = new int[x.length][];
		
		for(int i = 0; i < x.length; i++){
			z[i] = new int[x[i].length];
			for(int j = 0; j < x[i].length; j++)
				z[i][j] = x[i][j] + y[i][j];
		}
		return z;
	}
	
	static void printMatrix(int[][] m){
		for(int i = 0;i < m.length; i++){
			for(int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + "  ");
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("行列の行数 : "); int height = stdIn.nextInt();
		System.out.print("行列の列数 : "); int width = stdIn.nextInt();
		int[][] a = new int[height][width];
		int[][] b = new int[height][width];
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.printf("a[%d][%d] : ", i, j);
				a[i][j] = stdIn.nextInt();
			}
		}
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b[i].length; j++){
				System.out.printf("b[%d][%d] : ", i, j);
				b[i][j] = stdIn.nextInt();
			}
		}
		int[][] c = addMatrix(a, b);
		System.out.println(  "行列a"); printMatrix(a);
		System.out.println("\n行列b"); printMatrix(b);
		System.out.println("\n行列c"); printMatrix(c);
	}

}
