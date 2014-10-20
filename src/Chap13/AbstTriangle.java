package Chap13;
/**
 * クラスAbstTriangleは直角二等辺三角形を表す抽象クラスです。
 * このクラスは、図形を表す抽象クラスShapeから派生したクラスです。
 * 抽象クラスですから、本クラスのインスタンスを生成することはできません。
 * 具体的な直角二等辺三角形クラスは、このクラスから派生します。
 * @author saito-y
 * @see    Shape
 * @see    TriangleLB TriangleLU TriangleRB TriangleRU
 */

public abstract class AbstTriangle extends Shape {
	
	/**
	 * 一辺の長さを表すint型のフィールドです。
	 */
	private int length;
	
	/**
	 * 直角二等辺三角形を生成するコンストラクタです。
	 * 一辺の長さを引数として受け取ります。
	 * @param length 生成する直角二等辺三角形の一辺の長さ。
	 */
	public AbstTriangle(int length){
		setLength(length);
	}
	
	/**
	 * 一辺の長さを取得します。
	 * @param 一辺の長さ。
	 */
	public int getLength(){
		return length;
	}
	
	/**
	 * 一辺の長さを設定します。
	 * @param　length 設定する一辺の長さ。
	 */
	public void setLength(int length){
		this.length = length;
	}
	
	/**
	 * メソッドtoStringは、二等辺三角形に関する図形情報を表す文字列を返却します。
	 * @param 文字列"AbstTriangle(length:3)"を返却します。
	 *        3の部分は一辺の長さに応じた値です。
	 */
	public String toString(){
		return "AbstTriangle(length:" + length + ")";
	}

}
