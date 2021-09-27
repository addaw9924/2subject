
public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 0; //변수
		Integer b = 2; //래퍼 클래스
		String c = "123";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(Integer.parseInt(c)+100); //int.Parse() 와 같은 역할인듯
	}

}
