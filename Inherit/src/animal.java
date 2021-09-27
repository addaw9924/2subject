
public class animal {
	private double weight;
	String picture;
	
	void eat() {
		System.out.println("eat() 가 호출되었습니다.");
	}
	void sleep() {
		System.out.println("sleep()가 호출되었습니다.");
	}
}

class Lion extends animal{
	private int legs = 4;
	void roar() {
		System.out.println("roar()가 호출되었습니다.");
	}
	public static void main(String[] args) {
		Lion obj = new Lion();
	}
}

class Eagle extends animal{
	private int wings =2;
	void fly() {
		System.out.println("fly() 가 호출되었습니다.");
	}
}