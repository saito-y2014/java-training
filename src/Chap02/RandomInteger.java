package Chap02;

import java.util.Random;

public class RandomInteger {
	public static void main(String[] args){
		Random rand = new Random();
		
		int n1 =  1 + rand.nextInt(9);
		int n2 = -1 - rand.nextInt(9);
		int n3 = 10 + rand.nextInt(90);
		
		System.out.println("�R�̗����𐶐����܂����B");
		System.out.println("�P���̐��̐����F" + n1);
		System.out.println("�P���̕��̐����F" + n2);
		System.out.println("�Q���̐��̐����F" + n3);
		
		}

}
