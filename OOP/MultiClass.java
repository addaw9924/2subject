class Television {
	private int chanel;
	private int volume;
	String onoff;

//	} �ҽ� ���ʷ���Ʈ ���� ���ͷ� �����
	

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
		System.out.println("ä���� " + chanel + "������ " + volume + "�Դϴ�.");
	}
}

public class MultiClass {

	public static void main(String[] args) {
			Television tv1 = new Television();
			Television tv2 = new Television();
			Television tv3 = new Television();
			
			tv1.setChanel(5);
			tv1.setVolume(6);
			
			tv2.setChanel(5);
			tv2.setVolume(6);
			
			tv3.setChanel(5);
			tv3.setVolume(6);
			
			tv1.print();
			tv2.print();
			tv3.print();

	}
}
