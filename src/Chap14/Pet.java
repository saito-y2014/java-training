package Chap14;

public class Pet {
	private String name;
	private String masterName;
	
	public Pet(String name, String masterName){
		this.name = name;
		this.masterName = masterName;
	}
	
	public String getName() {return name;}
	
	
	public String getMasterName() {return masterName;}
	
	public void introduce(){
		System.out.println("���l�̖��O��" + name + "�ł��I");
		System.out.println("������l�l��" + masterName + "�ł��I");
	}
	

}
