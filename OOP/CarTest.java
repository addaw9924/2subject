
public class CarTest {
	public static void main(String[] args) {
		Car scar = new Car();
		Car ncar = new Car();
		
		scar.color = "black";
		scar.setGear("1");
		scar.speeddown();
		
		ncar.color = "white";
		ncar.setGear("23");
		ncar.speedup(); ncar.speedup();
		
		
		System.out.println(scar);
		System.out.println(ncar);
	}
}
