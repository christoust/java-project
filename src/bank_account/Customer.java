package bank_account;

public class Customer {
	private int customer_id;
	private String customer_name;
	private String customer_email;
	public Customer(int customer_id, String customer_name, String customer_email) {
//		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_email = customer_email;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public String getCustomer_email() {
		return customer_email;
	}

}
