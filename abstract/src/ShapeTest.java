
public class ShapeTest {
	public static void main(String[] args) {
		//Shape s0 = new Shape(); <- ¿À·ù
		Shape s1 = new Rectangle();
		Shape s2 = new Circle();
		s1.draw();
		s2.draw();
		Rectangle r1 = (Rectangle)s1;
		
	}
}
