package Chap14;

public class ShapeTester {
	public static void main(String[] args){
		Plane2D[] a = {
				new Rectangle(2, 5),
				new Parallelogram(2, 5),
		};
		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "]‚Ì–ÊÏ=" + a[i].getArea());
	}

}
