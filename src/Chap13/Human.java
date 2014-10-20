package Chap13;
/**
 * クラスHuman（Ver.5）は人間クラスです。
 * @author saito-y
 */

public class Human {
	/** 名前を表すint型のフィールドです。 */
	private String name;
	
	/** 身長を表すint型のフィールドです。 */
	private int height;
	
	/** 体重を表すint型のフィールドです。 */
	private int weight;
	
	/** 誕生日を表すDay型のフィールドです。 */
	private Day birthday;
	
	/**
	 * 人間クラスHumanのコンストラクタです。
	 * @param name 名前を表す文字列。
	 * @param height 身長を表す数値。
	 * @param weight 体重を表す数値。
	 * @param birthday 誕生日を表す日付。
	 */
	public Human(String name, int height, int weight, Day birthday){
		this.name = name;		this.height = height;
		this.weight = weight;	this.birthday = new Day(birthday);
	}
	
	/**
	 * 名前を調べます。
	 */
	public String getName() {return name;}
	
	/**
	 * 身長を調べます。
	 */
	public double getHeight() {return height;}
	
	/**
	 * 体重を調べます。
	 */
	public double getWeight() {return weight;}
	
	/**
	 * 誕生日を調べます。
	 */
	public Day getBirthday() {return new Day(birthday);}
	
	/**
	 * 太ります。引数に指定された値だけでは体重が増加します。
	 * @param w 体重の増加値。
	 */
	public void gainWeight(int w) {weight += w;}
	
	/**
	 * 痩せます。引数に指定された値だけでは体重が減少します。
	 * @param w 体重の減少値。
	 */
	public void reduceWeight(int w) {weight -= w;}
	
	/**
	 * 名前・身長・体重を表示します。
	 */
	public void putData(){
		System.out.println("名前 : " + name);
		System.out.println("身長 : " + height + "cm");
		System.out.println("体重 : " + weight + "kg");
	}
	
	/**
	 * 文字列表現を返します。
	 */
	public String toString(){
		return "{" + name + ": " + height + "cm " + weight + "kg " + birthday + "生まれ}";
	}

}
