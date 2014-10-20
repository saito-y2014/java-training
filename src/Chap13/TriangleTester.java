package Chap13;

import java.util.Scanner;

public class TriangleTester {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
			
			System.out.print("�O�p�`�͉��� : ");
			int no = stdIn.nextInt();
			AbstTriangle[] p = new AbstTriangle[no];
			
			for(int i = 0; i < no; i++){
				int type;
				do {
					System.out.print((i + 1) + "�Ԃ̎O�p�`�̎�� �i1�E�E�E�������p�^2�E�E�E���㒼�p" + "�^3�E�E�E�E�����p�^4�E�E�E�E�㒼�p�j : ");
					type = stdIn.nextInt();
				}while(type < 1 || type > 4);
				
				System.out.print("���� : ");
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
