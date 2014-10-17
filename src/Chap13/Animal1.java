package Chap13;

public abstract class Animal1 {
	private String name;
	
	public Animal1(String name)	{this.name = name;}
	
	public abstract void bark();
	
	public String getName() {return name;}
}
