package Chap15;a

import java.util.Scanner;

public class SearchString1 {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("•¶š—ñs1 : "); String s1 = stdIn.next();
		System.out.print("•¶š—ñs2 : "); String s2 = stdIn.next();
		
		int idx = s1.indexOf(s2);
		if(idx == -1)
			System.out.println("s1’†‚És2‚ÍŠÜ‚Ü‚ê‚Ü‚¹‚ñB");
		else {
			System.out.println(s1);
			for(int i = 0; i < idx; i++)
				System.out.print(' ');
			System.out.println(s2);
		}
	}

}
