package Chap08;

public class Car {
	private String name;
	private String number;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double tankage;
	private double fuel;
	private double sfc;
	
	Car(String name, String number, int width, int height, int length, double tankage, double fuel, double sfc){
		this.name = name;		this.number = number; 		this.width = width;
		this.height = height;	this.length = length;		this.tankage = tankage;
		this.fuel = (fuel <= tankage) ? fuel : tankage;
		this.sfc = sfc;			x = y = 0.0;
	}
	
	double getX() {return x;}
	double getY() {return y;}
	double getFuel() {return fuel;}
	
	void putSpec(){
		System.out.println("���@�@�O :" + name);
		System.out.println("�i���o�[  :" + number);
		System.out.println("�ԁ@�@�� :" + width + "mm");
		System.out.println("�ԁ@�@�� :" + height + "mm");
		System.out.println("�ԁ@�@�� :" + length + "mm");
		System.out.println("�^�@���@�N :" + tankage + "���b�g��");
		System.out.println("�R�@�@�� :" + sfc + "km/���b�g��");
	}
	
	boolean move(double dx, double dy){
		double dist = Math.sqrt(dx * dx + dy * dy);
		double f = dist / sfc;
		
		if(f > fuel)
			return false;
		else {
			fuel -= f;
			x += dx;
			y += dy;
			return true;
		}
	}
	void refuel(double df){
		if(df > 0){
			fuel += df;
			if(fuel > tankage)
				fuel = tankage;
		}
	}
	
}
