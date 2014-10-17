package Chap10;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Point2D {
	private static int counter = 0;
	private static int day;
	
	private int x = 0;
	private int y = 0;
	
	static{
		GregorianCalendar today = new GregorianCalendar();
		day = today.get(DATE);
	}
	{
		if(++counter == day){
			System.out.print("“–‚½‚è!!");
			System.out.printf("¡“ú%dŒÂ–Ú‚ÌÀ•W‚ª¶¬‚³‚ê‚Ü‚µ‚½B\n", counter);
		}
	}
	
	public Point2D()			{ }
	public Point2D(int x)		{this.x = x;}
	public Point2D(int x, int y){this.x = x; this.y = y;}
	
	public int getX() {return x;}
	public int getY() {return y;}
	
	public static int getCounter(){return counter;}
	
	public String toString(){
		return "(" + x + ", " + y + ")";
	}

}
