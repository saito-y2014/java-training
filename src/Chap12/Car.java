package Chap12;

public class Car {
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private Day purchaseDay;
	
	public Car(String name, int width, int height, int length, double fuel, Day purchaseDay){
		this.name = name;			this.width = width;			this.height = height;
		this.length = length;		this.fuel = fuel;			x = y = 0.0;
		this.purchaseDay = new Day(purchaseDay);
	}
	
	public double getX()		{return x;}
	public double getY()		{return y;}
	public double getFuel()		{return fuel;}
	public Day getPurchaseDay(){
		return new Day(purchaseDay);
	}
	
	public void putSpec(){
		System.out.println("���O : " + name);
		System.out.println("�ԕ� : " + width + "mm");
		System.out.println("�ԍ� : " + height + "mm");
		System.out.println("�Ԓ� : " + length + "mm");
	}
	
	public boolean move(double dx, double dy){
		double dist = Math.sqrt(dx * dx + dy * dy);
		
		if(dist > fuel)
			return false;
		else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}

}
