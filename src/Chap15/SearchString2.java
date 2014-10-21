package Chap15;a

import java.util.Scanner;

public class SearchString2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("文字列s1 : "); String s1 = stdIn.next();
		System.out.print("文字列s2 : "); String s2 = stdIn.next();
		
		int idx = s1.indexOf(s2);
		if(idx == -1)
			System.out.println("s1中にs2は含まれません。");
		else {
			int len = 0;
			for(int i = 0; i < idx; i++)
				len += s1.substring(i, i + 1).getBytes().length;
			len += s2.length();
			
			System.out.println((idx + 1) + "文字目にマッチします。");
			System.out.println(s1);
			System.out.printf(String.format("%%%ds\n",len), s2);
		}
	}

}
