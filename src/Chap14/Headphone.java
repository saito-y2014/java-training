package Chap14;

public class Headphone implements Wearable {
	int volume = 0;
	
	public void putOn(){
		System.out.println("ヘッドフォンを付けました。");
	}
	
	public void putOff(){
		System.out.println("ヘッドフォンを外しました。");
	}
	
	public void setVolume(int volume){
		this.volume = volume;
		System.out.println("ボリュームを" + volume + "に変更しました。");
	}

}
