package bank_account;

public  class Savings_account extends Account
{
//	public int acc_no;
//	public Customer customerobj;
//	public double balance;
	public double min_balance;
	
	
	
	public Savings_account(int account_no, Customer customerobj, double balance, double min_balance) {
	super(account_no, customerobj, balance);
	this.min_balance = min_balance;
}
	
	



	public boolean withdraw(double amount) {
		
		if(this.balance-amount>min_balance) {
			balance-= amount;
			System.out.println(balance);
			return true;
			
			
			
			
			
			//this.balance = this.balance - this.amount;
		}
//		else {
			return false;
//			System.out.println(this.balance);
		}
		public double new_balance(double balance){
			
			return balance;
			}
		
		
		
		
		
	
	
	
	
	}


