package Chap13;

/**
 * クラスTriangleRUは右上が直角の二等辺三角形を表すクラスです。
 * このクラスは、直角二等辺三角形を表す抽象クラスAbstTriangleから派生したクラスです。
 * @author saito-y
 * @see    Shape
 * @see    AbstTriangle
 */
public class TriangleRU extends AbstTriangle {
	
	/**
	 * 右上が直角の二等辺三角形を生成するコンストラクタです。
	 * 一辺の長さを引数として受け取ります。
	 * @param length 生成する直角二等辺三角形の一辺の長さ。
	 */
	public TriangleRU(int length) {super(length);}
	
	/**
	 * メソッドtoStingは、右上が直角の二等辺三角形に関する図形情報を表す文字列を返却します。
	 * @param 文字列"TriangleRU(length:3)"を返却します。
	 *        3の部分は長さに応じた値です。
	 */
	public String toString(){
		return "TriangleRU(length:" + getLength() + ")";
	}
	
	/**
	 * メソッドdrawは、右上が直角の二等辺三角形を描画します。
	 * 描画は、アステリスク記号'*'を並べることによって行います。
	 */
	public void draw(){
		for(int i = getLength(); i >= 1; i--){
			for(int j = 1; j <= getLength() - i; j++)
				System.out.print(' ');
			for(int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
