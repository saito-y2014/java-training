package Chap15;

public class StringTester {
	
	public static void main(String[] args){
		String s1 = null;
		String s2 = "";
		String s3 = "ABC";
		String s4 = "ABC";
		String s5 = "ABC";
		s5 = "XYZ";
		
		System.out.println("文字列s1 = " + s1);
		System.out.println("文字列s2 = " + s2);
		System.out.println("文字列s3 = " + s3);
		System.out.println("文字列s4 = " + s4);
		System.out.println("文字列s5 = " + s5);
		System.out.println("s3とs4は同じ文字列リテラルを参照" + ((s3 == s4) ? "している。" : "していない。"));
	}

}
