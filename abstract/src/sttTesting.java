
public class sttTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sttTest t1 = new sttTest();
		sttTest t2 = new sttTest();
		sttTest t3 = new sttTest();
		
		t1.x=1; t1.y=2;
		t2.x=10; t2.y=20;
		t3.x=100; t3.y =200;
		
		t1.cnt = 4; t2.cnt=5; t3.cnt=6;
		
		System.out.println(sttTest.cnt);
		System.out.println(t1.cnt); //스테틱을 사용했기때문에 마지막 cnt 를 사용한다.(공유개념) 
		sttTest.print();
		System.out.println(Math.random());
	}

}
