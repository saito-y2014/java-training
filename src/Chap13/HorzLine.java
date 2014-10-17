package Chap13;
/**
 * �N���XHorzLine�͐���������\���N���X�ł��B
 * ���̃N���X�́A������\�����ۃN���XAbstLine����h�������N���X�ł��B
 * @author saito-y
 *
 */
public class HorzLine extends AbstLine {
	
	/**
	 * ���������𐶐�����R���X�g���N�^�ł��B
	 * �����������Ƃ��Ď󂯎��܂��B
	 * @param length �������钼���̒����B
	 */
	public HorzLine(int length){super(length);}
	
	/**
	 * ���\�b�htoString�́A���������Ɋւ���}�`����\���������ԋp���܂��B
	 * @return ������"HorzLine(length:3)"��ԋp���܂��B
	 * �@�@�@�@�@�@�@�@3�̕����͒����ɉ������l�ł��B
	 */
	public String toString(){
		return "HorzLine(length:" + getLength() + ")";
	}
	
	/**
	 * ���\�b�hdraw�́A����������`�悵�܂��B
	 * �`��́A�}�C�i�X�L��'-'�����ɕ��ׂ邱�Ƃɂ���čs���܂��B
	 * �����̌�����'-'��A���\�����ĊJ�Ƃ��܂��B
	 */
	public void draw(){
		for(int i = 1; i <= getLength(); i++)
			System.out.print('-');
		System.out.println();
	}

}
