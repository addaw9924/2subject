package array;

public class PizzaTopping {

	public static void main(String[] args) {
		//String toppings[] = {"","","","","",""}; 
		
		String toppings[] = new String[5];
		toppings[0] = "pepperoni";
		toppings[1] = "mushroom";
		toppings[2] = "onions";
		toppings[3] = "sausage";
		toppings[4] = "bacon";		
		for (int i = 0; i < toppings.length; i++) {
			System.out.println(toppings[i]);
		}
	}

}
