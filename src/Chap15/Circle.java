package Chap15;

public class Circle {
	public static void main(String[] args){
		double r = Double.parseDouble(args[0]);
		System.out.printf("���a%.2f�̉~����%.2f�Ŗʐς�%.2f�ł��B\n", r, 2 * Math.PI * r * r);
	}
}
