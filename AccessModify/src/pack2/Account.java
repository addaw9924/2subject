package pack2;

public class Account {
	private int regname;
	private String name;
	private int balance;
	
	//construtor»ý¼ºÀÚ
	public Account(int regname) {
		super();
		this.regname = regname;
	}
	
	public int getRegname() {
		return regname;
	}

	public void setRegname(int regname) {
		this.regname = regname;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
