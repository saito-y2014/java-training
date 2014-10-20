package Chap14;

public class SkinnableRobotPet extends RobotPet implements Skinnable {
	private int skin;
	
	public SkinnableRobotPet(String name, String masterName, int skin){
		super(name, masterName);
		this.skin = skin;
	}
	
	public void printSkin(){
		switch(skin){
		case BLACK:		System.out.print("çï");		break;
		case RED:		System.out.print("ê‘");		break;
		case GREEN:		System.out.print("óŒ");		break;
		case BLUE:		System.out.print("ê¬");		break;
		case LEOPARD:	System.out.print("ï^ïø");	break;
		}
	}

	@Override
	public void changeSkin(int skin) {
		// TODO Auto-generated method stub
		
	}

}
