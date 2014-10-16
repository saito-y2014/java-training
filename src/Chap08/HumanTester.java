package Chap08;

public class HumanTester {
	public static void main(String[] args){
		Human suzuki = new Human();
		Human takada = new Human();
		
		suzuki.name = "鈴木二郎";
		suzuki.height = 170;
		suzuki.weight = 60;
		
		takada.name = "高田龍一";
		takada.height = 166;
		takada.weight = 72;
		
		System.out.println("名前 :" + suzuki.name);
		System.out.println("身長 :" + suzuki.height + "cm");
		System.out.println("体重 :" + suzuki.weight + "kg");
		System.out.println();
		
		System.out.println("名前 :" + takada.name);
		System.out.println("身長 :" + takada.height + "cm");
		System.out.println("体重 :" + takada.weight + "kg");
	}

}
