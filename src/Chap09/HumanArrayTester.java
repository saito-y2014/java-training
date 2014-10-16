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
				new Human2("ŒK–ìTˆê˜Y", 170, 70),
				new Human2("‚Œ´“O–ç", 160, 59),
		};
		
		System.out.print("”z—ñq‚Ì—v‘f” : ");
		n = stdIn.nextInt();
		
		Human2[] q = new Human2[n];
		for (int i = 0; i < q.length; i++){
			System.out.println("q[" + i + "]");
			System.out.print("–¼‘O : "); String name = stdIn.next();
			System.out.print("g’· : "); int height = stdIn.nextInt();
			System.out.print("‘Ìd : "); int weight = stdIn.nextInt();
			q[i] = new Human2(name, height, weight);
		}
		
		Human2[][] x = {
				{new Human2("’|“cË•½", 175, 52), new Human2("‹´ì’q”V", 169, 60)},
				{new Human2("ŽO‘îGŽ÷", 178, 70), new Human2("¬—Ñ—C‰î", 172, 61)},
				{new Human2("”’…—T—º", 168, 59), new Human2("“c’†‘åŠì", 165, 59)},
		};
		
		System.out.print("”z—ñy‚Ìs” : ");
		n = stdIn.nextInt();
		
		Human2[][] y = new Human2[n][];
		for (int i = 0; i < y.length; i++){
			System.out.print("y[" + i + "]‚Ì—ñ” : ");
			n = stdIn.nextInt();
			y[i] = new Human2[n];
			for(int j = 0; j < y[i].length; j++){
				System.out.print("–¼‘O : "); String name = stdIn.next();
				System.out.print("g’· : "); int height = stdIn.nextInt();
				System.out.print("‘Ìd : "); int weight = stdIn.nextInt();
				
				y[i][j] = new Human2(name, height, weight);
			}
		}
		
		System.out.println("¡”z—ñp");
		printHumanArray(p);
		
		System.out.println("¡”z—ñq");
		printHumanArray(q);
		
		System.out.println("¡”z—ñx");
		for (int i = 0; i < x.length; i++){
			System.out.printf("‘æ%ds\n", i);
			printHumanArray(x[i]);
		}
		
		System.out.println("¡”z—ñy");
		for(int i = 0; i < y.length; i++){
			System.out.printf("‘æ%ds\n", i);
			printHumanArray(y[i]);
		}
	}

}
