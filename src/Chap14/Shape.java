package Chap14;
/**
 * �N���XShape�́A�}�`�̊T�O��\�����ۃN���X�ł��B
 * ���ۃN���X�ł�����A�{�N���X�̃C���X�^���X�𐶐����邱�Ƃ͂ł��܂���B
 * ��̓I�Ȑ}�`�N���X�́A���̃N���X����h�����܂��B
 * @author saito-y
 *
 */
public abstract class Shape {
	/**
	 * �}�`����\���������ԋp���钊�ۃ��\�b�h�ł��B
	 * �N���XShape����h������N���X�ŁA���̃��\�b�h�̖{�̂��������܂��B
	 * ���̃��\�b�h�́Ajava.lang.Object�N���X�̃��\�b�h�𒊏ۃ��\�b�h�Ƃ��ăI�[�o���C�h�������\�b�h�ł��B
	 */
	public abstract String toString();
	/**
	 * ���\�b�hdraw�́A�}�`��`�悷�邽�߂̒��ۃ��\�b�h�ł��B
	 * �N���XShape����h������N���X�ŁA���̃��\�b�h�̖{�̂��������܂��B
	 */
	public abstract void draw();
	/**
	 * ���\�b�hprint�́A�}�`���̕\���Ɛ}�`�̕`����s���܂��B
	 * ��̓I�ɂ́A�ȉ��̓�̃X�e�b�v�������s���܂��B<BR>
	 * step 1. ���\�b�htoString���ԋp���镶�����\�����ĉ��s�B<BR>
	 * step 2. ���\�b�hdraw���Ăяo���Ă̐}�`�̕`��B<BR>
	 */
	public void print(){
		System.out.println(toString());
		draw();
	}

}
