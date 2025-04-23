package workshop.account.entity;

public class Account extends Object{
	
	private String custId;
	private String acctId;
	private int balance;
	
	// default constructor ������
	public Account() {
		System.out.println("Default Constructor Called..");
	}
	
	// constructor overloading (������ �ߺ�����)
	public Account(String custId, String acctId, int balance) {
		super();
		this.custId = custId;
		this.acctId = acctId;
		this.balance = balance;
	}

	//setter
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
//	public void setBalance(int balance) {
//		this.balance = balance;
//	} �Ա� ��� �Լ��� ó����
	
	//getter
	public int getBalance() {
		return balance;
	}
	public String getCustId() {
		return custId;
	}
	public String getAcctId() {
		return acctId;
	}
	
	//�Ա�
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	//���
	public void withdraw(int amount) {
		if (amount > balance) {
			System.out.println("�ܾ� ����");
		}
		this.balance -= amount;
	}
	
	// �θ� Ŭ������ ���� ������Ʈ��  toString() �޼��带 ������ (overriding)
	@Override
	public String toString() {
		return "AccountTest [custId = " + custId + ","
				+ "acctId = " + acctId
				+ ", balance = " + balance + "]";
	}

	
}
