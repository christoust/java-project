package maintanence_charge_collect;

public class CurrentAccount extends Account implements MaintanenceCharge {
	

	public CurrentAccount(String accountNumber, String customerName, float balance) {
		super(accountNumber, customerName, balance);
		// TODO Auto-generated constructor stub
	}
	
	
	public float calculateMaintenanceCharge(float noOfYears) {
		float n=100;
		return (n*noOfYears)+200 ;
	}
			
}
