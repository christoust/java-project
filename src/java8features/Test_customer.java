package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test_customer {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		Customer ob = new Customer(0, null, null, null, null);
		List<Customer> list = new ArrayList<Customer>();
		list.add(new Customer(100,"Christo","6238249203","chris@gmail.com","Kottayam"));
		list.add(new Customer(101,"Chris","6238249203","christy@gmail.com","Kottayam"));
		list.add(new Customer(102,"Blesson","62387789","blesson@gmail.com","Pala"));
		list.add(new Customer(103,"Anirudh","8238249203","ani@gmail.com","Piravom"));
		list.add(new Customer(104,"Jenson","9238249203","jenson@gmail.com","Thiruvalla"));
		list.add(new Customer(105,"Kevin","7238249203","kevin@gmail.com","Ernakulam"));
//		System.out.pr1intln(list);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rid");
		int n = sc.nextInt();
//		Map<Integer,Customer> map = list.stream().collect(Collectors.toMap(Customer::getReg_id,Customer:: ));
		List<Customer> list2 = list.stream().filter(t->t.getReg_id()==n).collect(Collectors.toList());
		System.out.println(list2);
		
		
	}

}
