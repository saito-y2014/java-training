package Chap14;

public class SkinnableSoftwareTester {
	
	public static void main(String[] args){
		SkinnableSoftware x = new SkinnableSoftware();
		SkinnableSoftware y = new SkinnableSoftware(Skinnable.GREEN);
		
		x.changeSkin(Skinnable.LEOPARD);
		
		System.out.println("x�̃X�L����" + x.getSkinString() + "�ł��B");
		System.out.println("y�̃X�L����" + y.getSkinString() + "�ł��B");
	}

}
