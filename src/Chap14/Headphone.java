package Chap14;

public class Headphone implements Wearable {
	int volume = 0;
	
	public void putOn(){
		System.out.println("�w�b�h�t�H����t���܂����B");
	}
	
	public void putOff(){
		System.out.println("�w�b�h�t�H�����O���܂����B");
	}
	
	public void setVolume(int volume){
		this.volume = volume;
		System.out.println("�{�����[����" + volume + "�ɕύX���܂����B");
	}

}
