
public abstract class Shape {
	private int x,y;
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public abstract void draw();
	
}

class Rectangle extends Shape{
	private int weight,height;

	public void draw() {
		System.out.println("�簢�� �׸��� �޼ҵ�");
	}
}

class Circle extends Shape{
	private int radius;
	public void draw() {
		System.out.println("���׸��� �޼ҵ�");
	}
}

