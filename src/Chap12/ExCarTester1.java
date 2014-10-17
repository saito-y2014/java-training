package Chap12;

public class ExCarTester1 {
	
	public static void main(String[] args){
		ExCar myCar = new ExCar("W140", 1885, 1490, 5220, 95.0, new Day(2005, 10, 13));
		
		System.out.printf("現在位置 : (%.2f, %.2f)\n", myCar.getX(), myCar.getY());
		System.out.printf(" 残り燃料 : (%.2fリットル\n", myCar.getFuel());
		System.out.printf(" 購 入 日 : (%s\n", myCar.getPurchaseDay());
	}

}
