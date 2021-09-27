package pack2;

public class AccountTest {
	public static void main(String[] args) {
		Account obj = new Account(123);
		
		obj.setBalance(1000000);
		obj.setName("tom");
		
		System.out.println("계좌번호는" + obj.getRegname() + "이고");
		
		System.out.println("이름은" + obj.getName() + "잔고는" + obj.getBalance()+"입니다.");
		
	}
	

}
