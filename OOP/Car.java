
public class Car {
	String color;
	String gear;
	int speed;
	@Override
	public String toString() {
		return "Car [color=" + color + ", gear=" + gear + ", speed=" + speed + "]";
	}
	
	public String getGear() {
		return gear;
	}
	public void setGear(String gear) {
		this.gear = gear;
	}
	
	void speedup() {
		speed = speed+10;
	}
	void speeddown() {
		speed=speed-10;
	}

}
