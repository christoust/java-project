package designpatterns;

public class Singleton_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton instance1=Singleton.getInstance();
		Singleton instance2=Singleton.getInstance();
		if(instance1==instance2)
		{
			System.out.println("Both are same instance");
		}
		else
		{
			System.out.println("Instances are different");
		}

	}

}
