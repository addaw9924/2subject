
public class TelevisionTest {

	public static void main(String[] args) {
		Television1 tv1 = new Television1();
		Television1 tv2 = new Television1();
		Television1 tv3 = new Television1();
		
		tv1.setChanel(5);
		tv1.setVolume(6);
		
		tv2.setChanel(5);
		tv2.setVolume(6);
		
		tv3.setChanel(5);
		tv3.setVolume(6);
		
		tv1.print();
		tv2.print();
		tv3.print();
	}
}
