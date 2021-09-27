package pack1;

public class MainTest {

	public static void main(String[] args) {
		PrivTest obj1 = new PrivTest();
		obj1.printB();
		
		DefaltTest obj2 = new DefaltTest();
		obj2.c=1;
		obj2.d=2; //default 같은 패키지에 있는 것만 사용 가능
		obj2.printC();
		obj2.printD();
	}

}
