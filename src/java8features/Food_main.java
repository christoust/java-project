package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Food_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Food_order> food=new ArrayList<>();
		food.add(new Food_order("100","Veg meals", "80"));
		food.add(new Food_order("101","Fish curry meals", "120"));
		food.add(new Food_order("102","Chapathi veg currry", "40"));
		food.add(new Food_order("103","Chapathi chicken curry", "120"));
		food.add(new Food_order("104","Veg fried rice", "60"));
		food.add(new Food_order("105","Chicken fried rice", "80"));
		Scanner sc = new Scanner(System.in);
		List<Food_Customer> customer = new ArrayList<Food_Customer>();
//		customer.add(new Food_Customer("245048","Jenson"));
		System.out.println("Food available");
		for (Food_order food_order : food) {
			System.out.println(food_order.getFid()+" "+food_order.getFname()+" "+food_order.getFprice());
			
		}
		System.out.println("Enter the food id of the food required");
		String s = sc.next();
		List<Food_order> req_food = food.stream().filter(t->t.getFid().equals(s)).toList();
		System.out.println(req_food);
		System.out.println("Enter your uid");
		String uid=sc.next();
		System.out.println("Enter your name");
		String name = sc.next();
		List<Food_Customer> l2= new ArrayList<Food_Customer>();
		
		
		l2.add(new Food_Customer(uid,name,req_food));
//		System.out.println(l2);
		System.out.println("operations \n 0.Cancel food\n 1.Update food \n 2.Remove food \n 3.Add food");
		System.out.println("Enter number");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 0:
			food.clear();
			System.out.println("food is canceled"+food);
			break;
		case 1:
			System.out.println("Enter the food to replace");
			String rep = sc.nextLine();
			System.out.println(rep);
			break;
		case 2:
		
			System.out.println("Enter the food item to remove");
			String rem = sc.nextLine();
			food.remove("Veg meals");
			
//			List<Food_order> removed=food.stream().filter(t->(t.getFname().equals(rem))).collect(Collectors.toList());
			 System.out.println(food);
			 break;
		
		

		}
	
			
		
		
 
	}
}

