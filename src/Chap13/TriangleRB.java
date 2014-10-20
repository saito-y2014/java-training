package Chap13;

/**
 * �N���XTriangleRB�͉E�������p�̓񓙕ӎO�p�`��\���N���X�ł��B
 * ���̃N���X�́A���p�񓙕ӎO�p�`��\�����ۃN���XAbstTriangle����h�������N���X�ł��B
 * @author saito-y
 * @see    Shape
 * @see    AbstTriangle
 */
public class TriangleRB extends AbstTriangle {
	
	/**
	 * �E�������p�̓񓙕ӎO�p�`�𐶐�����R���X�g���N�^�ł��B
	 * ��ӂ̒����������Ƃ��Ď󂯎��܂��B
	 * @param length �������钼�p�񓙕ӎO�p�`�̈�ӂ̒����B
	 */
	public TriangleRB(int length) {super(length);}
	
	/**
	 * ���\�b�htoString�́A�E�������p�񓙕ӎO�p�`�Ɋւ���}�`����\���������ԋp���܂��B
	 * @return ������"TriangleRB(length:3)"��ԋp���܂��B
	 *         3�̕����͒����ɉ������l�ł��B
	 */
	public String toString(){
		return "TriangleRB(length:" + getLength() + ")";
	}
	
	/**
	 * ���\�b�hdraw�́A�E�������p�̓񓙕ӎO�p�`��`�悵�܂��B
	 * �`��́A�A�X�e���X�N�L��'*'����ׂ邱�Ƃɂ���čs���܂��B
	 */
	public void draw(){
		for(int i = 1; i <= getLength(); i++){
			for(int j = 1; j <= getLength() - i; j++)
				System.out.print(' ');
			for(int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
