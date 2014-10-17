package Chap11;

import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.in;
import static java.lang.System.out;

public class MathMethods {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(in);
		out.print("À” : ");
		double x = stdIn.nextDouble();
		out.println("â‘Î’l : " + abs(x));
		out.println("•½•ûª : " + sqrt(x));
		out.println("–Ê@Ï  : " + PI * x * x);
	}

}
