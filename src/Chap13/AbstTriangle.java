package Chap13;
/**
 * �N���XAbstTriangle�͒��p�񓙕ӎO�p�`��\�����ۃN���X�ł��B
 * ���̃N���X�́A�}�`��\�����ۃN���XShape����h�������N���X�ł��B
 * ���ۃN���X�ł�����A�{�N���X�̃C���X�^���X�𐶐����邱�Ƃ͂ł��܂���B
 * ��̓I�Ȓ��p�񓙕ӎO�p�`�N���X�́A���̃N���X����h�����܂��B
 * @author saito-y
 * @see    Shape
 * @see    TriangleLB TriangleLU TriangleRB TriangleRU
 */

public abstract class AbstTriangle extends Shape {
	
	/**
	 * ��ӂ̒�����\��int�^�̃t�B�[���h�ł��B
	 */
	private int length;
	
	/**
	 * ���p�񓙕ӎO�p�`�𐶐�����R���X�g���N�^�ł��B
	 * ��ӂ̒����������Ƃ��Ď󂯎��܂��B
	 * @param length �������钼�p�񓙕ӎO�p�`�̈�ӂ̒����B
	 */
	public AbstTriangle(int length){
		setLength(length);
	}
	
	/**
	 * ��ӂ̒������擾���܂��B
	 * @param ��ӂ̒����B
	 */
	public int getLength(){
		return length;
	}
	
	/**
	 * ��ӂ̒�����ݒ肵�܂��B
	 * @param�@length �ݒ肷���ӂ̒����B
	 */
	public void setLength(int length){
		this.length = length;
	}
	
	/**
	 * ���\�b�htoString�́A�񓙕ӎO�p�`�Ɋւ���}�`����\���������ԋp���܂��B
	 * @param ������"AbstTriangle(length:3)"��ԋp���܂��B
	 *        3�̕����͈�ӂ̒����ɉ������l�ł��B
	 */
	public String toString(){
		return "AbstTriangle(length:" + length + ")";
	}

}
