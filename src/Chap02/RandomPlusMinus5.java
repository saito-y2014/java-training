package Chap02;

import java.util.Random;
import java.util.Scanner;

public class RandomPlusMinus5 {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int x = stdIn.nextInt();
		
		System.out.println("���̒l�}5�̗����𐶐����܂����B");
		System.out.println("�l��" + (x - 5 + rand.nextInt(11)) + "�ł��B");
	}
}
