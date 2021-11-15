
public class sttTest {
	int x= 10;
	int y= 20;
	static int cnt = 0;
	
	public sttTest(){
		cnt++;
	}
	
	public static void print() {
		System.out.println("나는 정적 메소드입니다.");
	}

	public void printTow() {
		System.out.println("나는 일반 메소드입니다.");
	}
}


