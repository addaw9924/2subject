
public class animal {
	private double weight;
	String picture;
	
	void eat() {
		System.out.println("eat() �� ȣ��Ǿ����ϴ�.");
	}
	void sleep() {
		System.out.println("sleep()�� ȣ��Ǿ����ϴ�.");
	}
}

class Lion extends animal{
	private int legs = 4;
	void roar() {
		System.out.println("roar()�� ȣ��Ǿ����ϴ�.");
	}
	public static void main(String[] args) {
		Lion obj = new Lion();
	}
}

class Eagle extends animal{
	private int wings =2;
	void fly() {
		System.out.println("fly() �� ȣ��Ǿ����ϴ�.");
	}
}