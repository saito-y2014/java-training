package Chap10;

public class IdTester {
	public static void main(String[] args){
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("aの識別番号 : " + a.getId());
		System.out.println("bの識別番号 : " + b.getId());
		
		System.out.println("最後に与えた識別番号 = " + Id.getMaxId());
		System.out.println("最後に与えた識別番号 = " +  a.getMaxId());
		System.out.println("最後に与えた識別番号 = " +  b.getMaxId());
	}

}
