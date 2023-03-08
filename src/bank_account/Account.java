package bank_account;

public abstract class Account {
	protected int account_no;
	protected Customer customerobj;
	protected double balance;
	public Account(int account_no, Customer customerobj, double balance) {
		super();
		this.account_no = account_no;
		this.customerobj = customerobj;
		this.balance = balance;
		}
	public abstract boolean  withdraw(double amount);
	

}
