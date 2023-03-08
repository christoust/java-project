package maintanence_charge_collect;

public class Account {
	private String accountNumber;
	private String customerName;
	private float balance;
	public Account(String accountNumber, String customerName, float balance) {
		super();
		this.setAccountNumber(accountNumber);
		this.setCustomerName(customerName);
		this.setBalance(balance);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(float d) {
		this.balance = d;
	}
	

}
