package Chap13;

public class Cat extends Animal {
	private int age;
	
	public Cat(String name, int age){
		super(name); this.age = age;
	}
	
	public void bark() {System.out.println("ƒjƒƒ`ƒ“!!");}
	
	public String toString(){
		return age + "Î‚Ì" + getName();
	}
	
}
