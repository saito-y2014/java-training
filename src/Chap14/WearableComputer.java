package Chap14;

public class WearableComputer implements Wearable {
	
	public void putOn(){
		System.out.println("コンピュータを起動しました。");
	}
	
	public void putOff(){
		System.out.println("コンピュータをシャットダウンしました。");
	}
	
	public void reset(){
		System.out.println("コンピュータを再起動しました。");
	}

}
