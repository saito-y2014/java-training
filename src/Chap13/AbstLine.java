package Chap13;
/**
 * �N���XAbstLine�͒�����\�����ۃN���X�ł��B
 * ���̃N���X�́A�}�`��\�����ۃN���XShape����h�������N���X�ł��B
 * ���ۃN���X�ł�����A�{�N���X�̃C���X�^���X�𐶐����邱�Ƃ͂ł��܂���B
 * ��̓I�Ȓ����N���X�́A���̃N���X����h�����܂��B
 * @author saito-y
 *
 */
public class AbstLine extends Shape {
	
	/**
	 * �����̒�����\��int�^�̃t�B�[���h�ł��B
	 */
	private int length;
	
	/**
	 * �����𐶐�����R���X�g���N�^�ł��B
	 * �����������Ƃ��Ď󂯎��܂��B
	 * @param length �������钼���̒����B
	 */
	public AbstLine(int length){
		setLength(length);
	}
	
	/**
	 * �����̒������擾���܂��B
	 * @return �����̒����B
	 */
	public int getLength(){
		return length;
	}
	
	/**
	 * �����̒�����ݒ肵�܂��B
	 * @param length �ݒ肷�钼���̒����B
	 */
	public void setLength(int length){
		this.length = length;
	}
	
	/**
	 * ���\�b�htoString�́A�����Ɋւ���}�`����\���������ԋp���܂��B
	 * @return ������"AbstLine(length:3)"��ԋp���܂��B
	 *         3�̕����͒����ɉ������l�ł��B
	 */
	public String toString(){
		return "AbstLine(length:" + length + ")";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}
