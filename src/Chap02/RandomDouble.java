package Chap02;

import java.util.Random;

public class RandomDouble {
	public static void main(String[] args){
		Random rand = new Random();
		
		double x1 = rand.nextDouble();
		double x2 = rand.nextDouble() * 10.0;
		double x3 = -1 + 2 * rand.nextDouble();
		
		System.out.println("�R�̗����𐶐����܂����B");
		System.out.println(" 0.0�ȏ� 1.0�����F" + x1);
		System.out.println(" 0.0�ȏ�10.0�����F" + x2);
		System.out.println("-1.0�ȏ� 1.0�����F" + x3);
	}

}
