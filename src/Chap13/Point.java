package Chap13;
/**
 * クラスPointは、点を表すクラスです。
 * このクラスは、図形を表す抽象クラスShapeから派生したクラスです。
 * フィールドはありません。
 * @author saito-y
 *
 */
public class Point extends Shape {
	/**
	 * 点を生成するコンストラクタです。
	 * 受け取る引数はありません。
	 */
	public Point(){
		//何も行わない
	}
	
	/**
	 * メソッドtoStringは、点に図形情報を表す文字列を返却します。
	 * 返却する文字列は、常に"Point"です。
	 * @return 文字列"Point"を返却します。
	 */
	public String toString(){
		return "Point";
	}
	
	/**
	 * メソッドdrawは、点を描写するメソッドです。
	 * プラス記号'+'を１個だけ表示して改行します。
	 */
	public void draw(){
		System.out.println('+');
	}
}
