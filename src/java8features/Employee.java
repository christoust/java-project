package java8features;

public class Employee {

	String emp_id;
	String emp_name;
	double salary;
	public Employee(String emp_id, String emp_name, double salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
	}
//	public int compareTo(Employee st){  
//		if(salary==st.salary)  
//		return 0;  
//		else if(salary>st.salary)  
//		return 1;  
//		else  
//		return -1;  
//		}  
}
