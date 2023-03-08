package designpatterns;

public class Concreteprototype implements Prototype {

	private int property;
	public int getProperty() {
		return property;
		
	}
	public Concreteprototype(int property)
	{
		this.property=property;
		
	}
}
