package maintanence_charge_collect;
import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	{
		Account a = new Account(null, null, 0);
		CurrentAccount c = new CurrentAccount(null, null, 0);
		Savings_Account s = new Savings_Account(null, null, 0);
		System.out.println("1.Savings Account \n 2.Current Account");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter the account number");
//			s.accountNumber  sc.next());
			a.setAccountNumber(sc.next());
//			a.getAccountNumber();
			System.out.println("Enter the customer name");
			a.setCustomerName(sc.next());
//			a.getCustomerName();
			System.out.println("Enter the balance amount");
			a.setBalance(sc.nextFloat());
//			a.getBalance();
			System.out.println("Entr the number of years");
			float no=sc.nextFloat();
//			System.out.println(no);
			System.out.println(a.getAccountNumber());
			System.out.println(a.getCustomerName());
			System.out.println(a.getBalance());
			float result = s.calculateMaintenanceCharge(no);
			System.out.println("Anual maintenence charge is "+result);
		}
		else {
			System.out.println("Enter the account number");
//			s.accountNumber  sc.next());
			a.setAccountNumber(sc.next());
//			a.getAccountNumber();
			System.out.println("Enter the customer name");
			a.setCustomerName(sc.next());
//			a.getCustomerName();
			System.out.println("Enter the balance amount");
			a.setBalance(sc.nextFloat());
//			a.getBalance();
			System.out.println("Entr the number of years");
			float no=sc.nextFloat();
//			System.out.println(no);
			System.out.println("Account Number\n"+a.getAccountNumber());
			System.out.println("Account Name\n"+a.getCustomerName());
			System.out.println("Account Balance\n"+a.getBalance());
			float result = c.calculateMaintenanceCharge(no);
			System.out.println("Anual maintenence charge is "+result);
			
		}
	}

}
