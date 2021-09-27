
public class StringTest1 {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "javaword";
		String c = new String("Welcome");
		
		System.out.println(a.charAt(0)); //hello 의 0번째 H만 출력하는것
		System.out.println(b == c);
		System.out.println(c.equals(a)); //똑같은 내용인지 확인하기 위해 스는것

	}

}
