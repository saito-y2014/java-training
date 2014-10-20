package Chap13;

import java.util.Scanner;

public class TriangleTester {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
			
			System.out.print("三角形は何個 : ");
			int no = stdIn.nextInt();
			AbstTriangle[] p = new AbstTriangle[no];
			
			for(int i = 0; i < no; i++){
				int type;
				do {
					System.out.print((i + 1) + "番の三角形の種類 （1・・・左下直角／2・・・左上直角" + "／3・・・右下直角／4・・・右上直角） : ");
					type = stdIn.nextInt();
				}while(type < 1 || type > 4);
				
				System.out.print("長さ : ");
				int len = stdIn.nextInt();
				p[i] = 	(type == 1) ? new TriangleLB(len) :
						(type == 2) ? new TriangleLU(len) :
						(type == 3) ? new TriangleRB(len) :
									  new TriangleRU(len);
			}
			
			for (AbstTriangle s : p){
				s.print();
				System.out.println();
		}
	}

}
