package Chap14;

public class HeadMountedDisplay implements Wearable, Skinnable{
	private int skin;
	
	public void putOn(){
		System.out.println("ディスプレイを付けました。");
	}
	
	public void putOff(){
		System.out.println("ディスプレイを外しました。");
	}
	
	public void changeSkin(int skin){
		this.skin = skin;
	}
	
	public void putSkin(){
		switch (skin){
		case BLACK:		System.out.println("BLACK DISPLAY");	break;
		case RED:		System.out.println("RED DISPLAY");		break;
		case GREEN:		System.out.println("BLUE DISPLAY");		break;
		case LEOPARD:	System.out.println("LEOPARD DISPLAY");	break;
		}
	}

}
