package Chap11;

import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.in;
import static java.lang.System.out;

public class MathMethods {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(in);
		out.print("���� : ");
		double x = stdIn.nextDouble();
		out.println("��Βl : " + abs(x));
		out.println("������ : " + sqrt(x));
		out.println("�ʁ@��  : " + PI * x * x);
	}

}
