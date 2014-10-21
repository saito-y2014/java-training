package Chap15;

public class Circle {
	public static void main(String[] args){
		double r = Double.parseDouble(args[0]);
		System.out.printf("”¼Œa%.2f‚Ì‰~ü‚Í%.2f‚Å–ÊÏ‚Í%.2f‚Å‚·B\n", r, 2 * Math.PI * r * r);
	}
}
