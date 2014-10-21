package Chap15;

public class PrintArgs1 {
	public static void main(String[] args){
		for(int i = 0; i < args.length; i++){
			System.out.print("args[" + i + "] = ");
			for(int j = 0; j < args[i].length(); j++)
				System.out.print(args[i].charAt(j));
			System.out.println();
		}
	}

}
