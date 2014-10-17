package Chap13;
/**
 * �N���XRectangle�́A�����`��\���N���X�ł��B
 * ���̃N���X�́A�}�`��\�����ۃN���XShape����h�������N���X�ł��B
 * @author saito-y
 *
 */
public class Rectangle extends Shape {
	
	/**
	 * �����`�̕���\��int�^�̃t�B�[���h�ł��B
	 */
	public int width;
	
	/**
	 * �����`�̍�����\��int�^�̃t�B�[���h�ł��B
	 */
	public int height;
	
	/**
	 * �����`�𐶐�����R���X�g���N�^�ł��B
	 * ���ƍ����������Ƃ��Ď󂯎��܂��B
	 * @param width �����`�̕��B
	 * @param height �����`�̍����B
	 */
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	/**
	 * ���\�b�htoString�́A�����`�Ɋւ���}�`����\���������ԋp���܂��B
	 * @return ������"Rectangle(width:4, height:3)"��ԋp���܂��B
	 *         4��3�̕����́A���ꂼ�ꕝ�ƍ����ɉ������l�ł��B
	 */
	public String toString(){
		return "Rectangle(width:" + width + ", height:" + height + ")";
	}
	
	/**
	 * ���\�b�hdraw�́A�����`��`�悵�܂��B
	 * �`��́A�A�X�e���X�N�L��'*'����ׂ邱�Ƃɂ���čs���܂��B
	 * ���̌�����'*'��\�����ĉ��s����̂�width�񂾂��J��Ԃ��܂��B
	 */
	public void draw(){
		for(int i = 1; i <= height; i++){
			for(int j = 1; j <= width; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
