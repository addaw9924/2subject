public class UMLTele {
	private boolean ison;
	private int volume;
	private int chanel;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getChanel() {
		return chanel;
	}
	public void setChanel(int chanel) {
		this.chanel = chanel;
	}
	
	public void turnon() {
		ison=true;
	}
	public void turnoff() {
		ison=false;
	}
	@Override
	public String toString() {
		return "UMLTele [ison=" + ison + ", volume=" + volume + ", chanel=" + chanel + "]";
	}
	
	
}
