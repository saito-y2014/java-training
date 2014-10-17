package Chap13;

public class AnimalTester2 {
	public static void main(String[] args){
		Animal[] a = {
				new Dog("ハチ公", "柴犬"),
				new Cat("マイケル", 7),
		};
		
		for(int i = 0; i < a.length; i++){
			System.out.print("a[" + i + "] = ");
			a[i].introduce();
		}
	}

}
