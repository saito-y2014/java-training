package Chap13;
/**
 * �N���XPoint�́A�_��\���N���X�ł��B
 * ���̃N���X�́A�}�`��\�����ۃN���XShape����h�������N���X�ł��B
 * �t�B�[���h�͂���܂���B
 * @author saito-y
 *
 */
public class Point extends Shape {
	/**
	 * �_�𐶐�����R���X�g���N�^�ł��B
	 * �󂯎������͂���܂���B
	 */
	public Point(){
		//�����s��Ȃ�
	}
	
	/**
	 * ���\�b�htoString�́A�_�ɐ}�`����\���������ԋp���܂��B
	 * �ԋp���镶����́A���"Point"�ł��B
	 * @return ������"Point"��ԋp���܂��B
	 */
	public String toString(){
		return "Point";
	}
	
	/**
	 * ���\�b�hdraw�́A�_��`�ʂ��郁�\�b�h�ł��B
	 * �v���X�L��'+'���P�����\�����ĉ��s���܂��B
	 */
	public void draw(){
		System.out.println('+');
	}
}
