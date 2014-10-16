package Chap09;

import java.util.Scanner;

public class HumanArrayTester {
	static void printHumanArray(Human2[] a){
		for(int i = 0; i < a.length; i++)
			System.out.printf("No.%d %s %3dcm %3dkg\n",
					i, a[i].getName(), a[i].getHeight(), a[i].getWeight());
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		Human2[] p = {
				new Human2("�K��T��Y", 170, 70),
				new Human2("�����O��", 160, 59),
		};
		
		System.out.print("�z��q�̗v�f�� : ");
		n = stdIn.nextInt();
		
		Human2[] q = new Human2[n];
		for (int i = 0; i < q.length; i++){
			System.out.println("q[" + i + "]");
			System.out.print("���O : "); String name = stdIn.next();
			System.out.print("�g�� : "); int height = stdIn.nextInt();
			System.out.print("�̏d : "); int weight = stdIn.nextInt();
			q[i] = new Human2(name, height, weight);
		}
		
		Human2[][] x = {
				{new Human2("�|�c�˕�", 175, 52), new Human2("����q�V", 169, 60)},
				{new Human2("�O��G��", 178, 70), new Human2("���їC��", 172, 61)},
				{new Human2("�����T��", 168, 59), new Human2("�c�����", 165, 59)},
		};
		
		System.out.print("�z��y�̍s�� : ");
		n = stdIn.nextInt();
		
		Human2[][] y = new Human2[n][];
		for (int i = 0; i < y.length; i++){
			System.out.print("y[" + i + "]�̗� : ");
			n = stdIn.nextInt();
			y[i] = new Human2[n];
			for(int j = 0; j < y[i].length; j++){
				System.out.print("���O : "); String name = stdIn.next();
				System.out.print("�g�� : "); int height = stdIn.nextInt();
				System.out.print("�̏d : "); int weight = stdIn.nextInt();
				
				y[i][j] = new Human2(name, height, weight);
			}
		}
		
		System.out.println("���z��p");
		printHumanArray(p);
		
		System.out.println("���z��q");
		printHumanArray(q);
		
		System.out.println("���z��x");
		for (int i = 0; i < x.length; i++){
			System.out.printf("��%d�s\n", i);
			printHumanArray(x[i]);
		}
		
		System.out.println("���z��y");
		for(int i = 0; i < y.length; i++){
			System.out.printf("��%d�s\n", i);
			printHumanArray(y[i]);
		}
	}

}
