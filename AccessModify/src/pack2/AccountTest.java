package pack2;

public class AccountTest {
	public static void main(String[] args) {
		Account obj = new Account(123);
		
		obj.setBalance(1000000);
		obj.setName("tom");
		
		System.out.println("���¹�ȣ��" + obj.getRegname() + "�̰�");
		
		System.out.println("�̸���" + obj.getName() + "�ܰ��" + obj.getBalance()+"�Դϴ�.");
		
	}
	

}
