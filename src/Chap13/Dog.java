package Chap13;

public class Dog extends Animal {
	private String type;
	
	public Dog(String name, String type){
		super(name); this.type = type;
	}
	
	public void bark() {System.out.println("ƒƒ“ƒƒ“!!");}
	public String toString(){
		return type + "‚Ì" + getName();
	}
}
