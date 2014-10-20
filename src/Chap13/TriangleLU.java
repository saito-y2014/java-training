package Chap13;

/**
 * �N���XTriangleLU�͍��オ���p�̓񓙕ӎO�p�`��\���N���X�ł��B
 * ���̃N���X�́A���p�񓙕ӎO�p�`��\�����ۃN���XAbstTriangle����h�������N���X�ł��B
 * @author saito-y
 * @see    Shape
 * @see    AbstTriangle
 */
public class TriangleLU extends AbstTriangle {
	
	/**
	 * ���オ���p�̓񓙕ӎO�p�`�𐶐�����R���X�g���N�^�ł��B
	 * ��ӂ̒����������Ƃ��Ď󂯎��܂��B
	 * @param length �������钼�p�񓙕ӎO�p�`�̈�ӂ̒����B
	 */
	public TriangleLU(int length) {super(length);}
	
	/**
	 * ���\�b�htoString�́A���オ���p�̓񓙕ӎO�p�`�Ɋւ���}�`����\���������ԋp���܂��B
	 * @return ������"TriangleLU(length:3)"��ԋp���܂��B
	 *         3�̕����͒����ɉ������l�ł��B
	 */
	public String toString(){
		return "TriangleLU(length:" + getLength() + ")";
	}
	
	/**
	 * ���\�b�hdraw�́A���オ���p�̓񓙕ӎO�p�`��`�悵�܂��B
	 * �`��́A�A�X�e���X�N�L��'*'����ׂ邱�Ƃɂ���čs���܂��B
	 */
	public void draw(){
		for(int i = getLength(); i >= 1; i--){
			for(int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
