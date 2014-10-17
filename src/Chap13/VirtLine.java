package Chap13;
/**
 * �N���XVirtLine�͐���������\���N���X�ł��B
 * ���̃N���X�́A������\�����ۃN���XAbstLine����h�������N���X�ł��B
 * @author saito-y
 *
 */

public class VirtLine extends AbstLine {
	
	/**
	 * ���������𐶐�����R���X�g���N�^�ł��B
	 * �����������Ƃ��Ď󂯎��܂��B
	 * @param length �������钼���̒����B
	 */
	public VirtLine(int length) {super(length);}
	
	/**
	 * ���\�b�htoString�́A���������Ɋւ���}�`����\���������ԋp���܂��B
	 * @return ������"VirtLine(length:3)"��ԋp���܂��B
	 *         3�̕����͒����ɉ������l�ł��B
	 */
	public String toString(){
		return "VirtLine(length:" + getLength() + ")";
	}
	
	/**
	 * ���\�b�hdraw�́A����������`�悵�܂��B
	 * �`��́A�c���L��'|'���c�ɕ��ׂ邱�Ƃɂ���čs���܂��B
	 * �����̌�����'|'��\�����ĉ��s���J��Ԃ��܂��B
	 */
	
	public void draw(){
		for(int i = 1; i <= getLength(); i++)
			System.out.println('|');
	}

}
