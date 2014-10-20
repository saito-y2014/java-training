package Chap14;

public class SkinnableSoftwareTester {
	
	public static void main(String[] args){
		SkinnableSoftware x = new SkinnableSoftware();
		SkinnableSoftware y = new SkinnableSoftware(Skinnable.GREEN);
		
		x.changeSkin(Skinnable.LEOPARD);
		
		System.out.println("xのスキンは" + x.getSkinString() + "です。");
		System.out.println("yのスキンは" + y.getSkinString() + "です。");
	}

}
