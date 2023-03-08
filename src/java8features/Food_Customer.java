package java8features;

import java.util.List;

public class Food_Customer  {
   private String uid;
   private String name;
   List l1;

@Override
public String toString() {
	return "Food_Customer [uid=" + uid + ", name=" + name + ", l1=" + l1 + "]";
}
/**
 * @return the uid
 */
public String getUid() {
	return uid;
}
public Food_Customer(String uid, String name,List l1) {
	super();
	this.uid = uid;
	this.name = name;
	this.l1=l1;
	
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @return the l1
 */
public List<Food_Customer> getL1() {
	return l1;
}
/**
 * @param uid the uid to set
 */
public void setUid(String uid) {
	this.uid = uid;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @param l1 the l1 to set
 */
public void setL1(List<Food_Customer> l1) {
	this.l1 = l1;
}
/**
 * @return the name
 }*/
}