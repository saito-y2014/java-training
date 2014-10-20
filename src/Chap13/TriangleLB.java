package Chap13;

/**
 * クラスTriangleLBは左下が直角の二等辺三角形を表すクラスです。
 * このクラスは、直角二等辺三角形を表す抽象クラスAbstTrinagleから派生したクラスです。
 * @author saito-y
 * @see    Shape
 * @see    AbstTriangle
 */
public class TriangleLB extends AbstTriangle {
	
	/**
	 * 左下が直角の二等辺三角形を生成するコンストラクタです。
	 * 一辺の長さを引数として受け取ります。
	 * @param length 生成する直角二等辺三角形の一辺の長さ。
	 */
	public TriangleLB(int length) {super(length);}
	
	/**
	 * メソッドtoStringは、左下が直角の二等辺三角形に関する図形情報を表す文字列を返却します。
	 * @return 文字列"TriangleLB(length:3)"を返却します。
	 *         3の部分は長さに応じた値です。
	 */
	public String toString(){
		return "TriangleLB(length:" + getLength() + ")";
	}
	
	/**
	 * メソッドdrawは、左下が直角の二等辺三角形を描画します。
	 * 描画は、アステリスク記号'*'を並べることによって行います。
	 */
	public void draw(){
		for(int i = 1; i <= getLength(); i++){
			for(int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
