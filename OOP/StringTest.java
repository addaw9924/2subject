
public class StringTest {

	public static void main(String[] args) {
		String proved = "A varking";
		String s1,s2,s3,s4;
		
		s1=proved.concat("never Bites");
		s2=proved.replace('B', 'b');
		s3=proved.substring(2,5);
		s4=proved.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
