package Chap08;

public class CarTester1 {
	public static void main(String[] args){
		Car vitz = new Car("�r�b�c", "����999��99-99", 1660, 1500, 3640, 40.0, 35.0, 12.0);
		Car march = new Car("�}�[�`", "����999��99-99", 1660, 1525, 3695, 41.0, 35.0, 12.0);
		
		vitz.putSpec();
		System.out.println();
		march.putSpec();
	}

}