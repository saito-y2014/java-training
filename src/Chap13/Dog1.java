package Chap13;

public class Dog1 extends Animal1 {
	private String type;
	
	public Dog1(String name, String type){
		super(name); this.type = type;
	}
	
	public void bark() {System.out.println("ƒƒ“ƒƒ“!!");}
}
