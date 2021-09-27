
public class RectangleTest {
public static void main(String[] args) {
	Rectangle r1 = new Rectangle();
	Rectangle r2 = new Rectangle();
	r1.setX(5);
	r1.setY(3);
	r1.setWidth(24);
	r1.setHeight(21);
	
	r2.setX(1);
	r2.setY(5);
	r2.setWidth(21);
	r2.setHeight(42);
	
	r1.print();
	r1.draw();
	r2.print();
	r2.draw();
}
}
