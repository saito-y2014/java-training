package Chap08;

import java.util.Scanner;

public class CarTester2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�Ԃ̃f�[�^����͂���B");
		System.out.print("���@�@�@�O :");	String name = stdIn.next();
		System.out.print("�i �� �o �[  :");	String number = stdIn.next();
		System.out.print("�ԁ@�@�@�� :");	int width = stdIn.nextInt();
		System.out.print("���@�@�@ ��  :");	int height = stdIn.nextInt();
		System.out.print("���@�@�@ ��  :");	int length = stdIn.nextInt();
		System.out.print("�^���N�e�� :");	double tank = stdIn.nextDouble();
		System.out.print("�K�\���� �� :");	double fuel = stdIn.nextDouble();
		System.out.print("�R�@�@�@�� :");	double sfc = stdIn.nextDouble();
		
		Car myCar = new Car(name, number, width, height, length, tank, fuel, sfc);
		
		while(true){
			System.out.printf("���ݒn : (%.2f, %.2f)\n", myCar.getX(), myCar.getY());
			System.out.printf("�c��R�� : %.2f\n", myCar.getFuel());
			System.out.print("�ړ����܂���[0�E�E�ENo�^1�E�E�EYes] : ");
			if(stdIn.nextInt() == 0) break;
			
			System.out.print("X�����̈ړ����� : ");
			double dx = stdIn.nextDouble();
			
			System.out.print("Y�����̈ړ����� : ");
			double dy = stdIn.nextDouble();
			
			if(!myCar.move(dx, dy))
				System.out.println("�R���s��!!");
		}
	}

}
