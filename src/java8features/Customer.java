package java8features;

public class Customer {
   private int reg_id;
   private String name;
   private String phno;
   private String email;
   private String location;
public Customer(int reg_id, String name, String phno, String email, String location) {
	super();
	this.reg_id = reg_id;
	this.name = name;
	this.phno = phno;
	this.email = email;
	this.location = location;
}
@Override
public String toString() {
	return "Customer [reg_id=" + reg_id + ", name=" + name + ", phno=" + phno + ", email=" + email + ", location="
			+ location + "]";
}
/**
 * @return the reg_id
 */
public int getReg_id() {
	return reg_id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @return the phno
 */
public String getPhno() {
	return phno;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @return the location
 */
public String getLocation() {
	return location;
}
/**
 * @param reg_id the reg_id to set
 */
public void setReg_id(int reg_id) {
	this.reg_id = reg_id;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @param phno the phno to set
 */
public void setPhno(String phno) {
	this.phno = phno;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @param location the location to set
 */
public void setLocation(String location) {
	this.location = location;
}

   
}
