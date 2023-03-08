package maintanence_charge_collect;

public class Savings_Account extends Account implements MaintanenceCharge {

	public Savings_Account(String accountNumber, String customerName, float balance) {
		super(accountNumber, customerName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateMaintenanceCharge(float noOfYears) {
		float m=50;
		
		return (m*noOfYears)+50;
	}
	
	
}
