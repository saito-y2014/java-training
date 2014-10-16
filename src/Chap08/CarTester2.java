package Chap08;

import java.util.Scanner;

public class CarTester2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("車のデータを入力せよ。");
		System.out.print("名　　　前 :");	String name = stdIn.next();
		System.out.print("ナ ン バ ー  :");	String number = stdIn.next();
		System.out.print("車　　　幅 :");	int width = stdIn.nextInt();
		System.out.print("高　　　 さ  :");	int height = stdIn.nextInt();
		System.out.print("長　　　 さ  :");	int length = stdIn.nextInt();
		System.out.print("タンク容量 :");	double tank = stdIn.nextDouble();
		System.out.print("ガソリン 量 :");	double fuel = stdIn.nextDouble();
		System.out.print("燃　　　費 :");	double sfc = stdIn.nextDouble();
		
		Car myCar = new Car(name, number, width, height, length, tank, fuel, sfc);
		
		while(true){
			System.out.printf("現在地 : (%.2f, %.2f)\n", myCar.getX(), myCar.getY());
			System.out.printf("残り燃料 : %.2f\n", myCar.getFuel());
			System.out.print("移動しますか[0・・・No／1・・・Yes] : ");
			if(stdIn.nextInt() == 0) break;
			
			System.out.print("X方向の移動距離 : ");
			double dx = stdIn.nextDouble();
			
			System.out.print("Y方向の移動距離 : ");
			double dy = stdIn.nextDouble();
			
			if(!myCar.move(dx, dy))
				System.out.println("燃料不足!!");
		}
	}

}
