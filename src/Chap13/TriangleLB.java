package Chap13;

/**
 * �N���XTriangleLB�͍��������p�̓񓙕ӎO�p�`��\���N���X�ł��B
 * ���̃N���X�́A���p�񓙕ӎO�p�`��\�����ۃN���XAbstTrinagle����h�������N���X�ł��B
 * @author saito-y
 * @see    Shape
 * @see    AbstTriangle
 */
public class TriangleLB extends AbstTriangle {
	
	/**
	 * ���������p�̓񓙕ӎO�p�`�𐶐�����R���X�g���N�^�ł��B
	 * ��ӂ̒����������Ƃ��Ď󂯎��܂��B
	 * @param length �������钼�p�񓙕ӎO�p�`�̈�ӂ̒����B
	 */
	public TriangleLB(int length) {super(length);}
	
	/**
	 * ���\�b�htoString�́A���������p�̓񓙕ӎO�p�`�Ɋւ���}�`����\���������ԋp���܂��B
	 * @return ������"TriangleLB(length:3)"��ԋp���܂��B
	 *         3�̕����͒����ɉ������l�ł��B
	 */
	public String toString(){
		return "TriangleLB(length:" + getLength() + ")";
	}
	
	/**
	 * ���\�b�hdraw�́A���������p�̓񓙕ӎO�p�`��`�悵�܂��B
	 * �`��́A�A�X�e���X�N�L��'*'����ׂ邱�Ƃɂ���čs���܂��B
	 */
	public void draw(){
		for(int i = 1; i <= getLength(); i++){
			for(int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
