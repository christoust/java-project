package bank_account;

public class Test {

	public static void main(String[] args)
	{
		Customer c = new Customer(123,"ad","ad");
//		Account b = new Account(123,c,456);
		Savings_account a = new Savings_account(123,c,456,10);
		boolean res = a.withdraw(450);
		if(res) {
			System.out.println("Account holder's name\t"+c.getCustomer_name());
			System.out.println("Account id\t"+c.getCustomer_id());
			System.out.println("customer mail\t"+c.getCustomer_email());
			System.out.println("Account balance is\t"+ a.balance);
		}
		else
		{
			System.out.println("Amount cannot be withdrawn");
		}
		
//		System.out.println(a.balance);
	}
}
