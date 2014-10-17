package Chap10;

public class Id2 {
	static int counter = 0;
	
	private int id2;
	
	public Id2(){
		id2 = ++counter;
	}
	public int getId(){
		return id2;
	}

}
