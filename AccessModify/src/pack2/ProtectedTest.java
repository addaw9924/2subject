package pack2;

import pack1.ProtTest; //컨트롤+시프트+ o

public class ProtectedTest extends ProtTest{

	public static void main(String[]args) {
		ProtectedTest obj4 = new ProtectedTest();
		obj4.e=1;
	}
}