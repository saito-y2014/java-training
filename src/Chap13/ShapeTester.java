package Chap13;

import java.util.Scanner;

public class ShapeTester {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�}�`�͉��� : ");
		int no = stdIn.nextInt();
		Shape[] p = new Shape[no];
		
		for(int i = 0; i < no; i++){
			int type;
			do{
				System.out.print((i + 1) + "�Ԃ̐}�`�̎�ށi1�E�E�E�_�^2�E�E�E��������" + "�^3�E�E�E���������^4�E�E�E�����`�j : ");
				type = stdIn.nextInt();
			}while(type < 1 || type > 4);
			
			switch(type){
			case 1 : p[i] = new Point();
							break;
							
			case 2 :
			case 3 : System.out.print("���� : ");
					 int len = stdIn.nextInt();
					 p[i] = (type == 2) ? new HorzLine(len) : new VirtLine(len);
					 break;
					 
			case 4 : System.out.print("���@�@ : ");
					 int width = stdIn.nextInt();
					 System.out.print("�����@ : ");
					 int height = stdIn.nextInt();
					 p[i] = new Rectangle(width, height);
			}
		}
		
		for(Shape s : p){
			s.print();
			System.out.println();
		}
	}

}
