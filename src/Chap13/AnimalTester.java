package Chap13;

public class AnimalTester {
	public static void main(String[] args){
//		Animal x = new Animal();
		Animal1[] a = new Animal1[2];
		a[0] = new Dog1("ハチ公", "柴犬");
		a[1] = new Cat1("マイケル", 7);
		
		for(Animal1 s : a){
			System.out.print(s.getName() + " ");
			s.bark();
			System.out.println();
			
/*		for(int i = 0; i < a.length; i++){
 			System.out.print(a[i].getName() + " ");
 			a[i].bark();
 			System.out.println();
 			}
 */
			
		}
	}

}
