
public class Television1 {
	private int chanel;
	private int volume;
	String onoff;
	

//	} 소스 제너레이트 겟터 세터로 만들기
	

	public int getChanel() {
		return chanel;
	}
	public int getVolume() {
		return volume;
	}
	void setChanel(int chanel) {
		this.chanel = chanel;
	}
	void setVolume(int volume) {
		this.volume = volume;
	}
	
	void print()
	{
		System.out.println("채널은 " + chanel + "볼륨은 " + volume + "입니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
