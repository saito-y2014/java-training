package Chap13;
/**
 * �N���XHuman�iVer.5�j�͐l�ԃN���X�ł��B
 * @author saito-y
 */

public class Human {
	/** ���O��\��int�^�̃t�B�[���h�ł��B */
	private String name;
	
	/** �g����\��int�^�̃t�B�[���h�ł��B */
	private int height;
	
	/** �̏d��\��int�^�̃t�B�[���h�ł��B */
	private int weight;
	
	/** �a������\��Day�^�̃t�B�[���h�ł��B */
	private Day birthday;
	
	/**
	 * �l�ԃN���XHuman�̃R���X�g���N�^�ł��B
	 * @param name ���O��\��������B
	 * @param height �g����\�����l�B
	 * @param weight �̏d��\�����l�B
	 * @param birthday �a������\�����t�B
	 */
	public Human(String name, int height, int weight, Day birthday){
		this.name = name;		this.height = height;
		this.weight = weight;	this.birthday = new Day(birthday);
	}
	
	/**
	 * ���O�𒲂ׂ܂��B
	 */
	public String getName() {return name;}
	
	/**
	 * �g���𒲂ׂ܂��B
	 */
	public double getHeight() {return height;}
	
	/**
	 * �̏d�𒲂ׂ܂��B
	 */
	public double getWeight() {return weight;}
	
	/**
	 * �a�����𒲂ׂ܂��B
	 */
	public Day getBirthday() {return new Day(birthday);}
	
	/**
	 * ����܂��B�����Ɏw�肳�ꂽ�l�����ł͑̏d���������܂��B
	 * @param w �̏d�̑����l�B
	 */
	public void gainWeight(int w) {weight += w;}
	
	/**
	 * �����܂��B�����Ɏw�肳�ꂽ�l�����ł͑̏d���������܂��B
	 * @param w �̏d�̌����l�B
	 */
	public void reduceWeight(int w) {weight -= w;}
	
	/**
	 * ���O�E�g���E�̏d��\�����܂��B
	 */
	public void putData(){
		System.out.println("���O : " + name);
		System.out.println("�g�� : " + height + "cm");
		System.out.println("�̏d : " + weight + "kg");
	}
	
	/**
	 * ������\����Ԃ��܂��B
	 */
	public String toString(){
		return "{" + name + ": " + height + "cm " + weight + "kg " + birthday + "���܂�}";
	}

}
