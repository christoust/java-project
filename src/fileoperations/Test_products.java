package fileoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test_products {
	
	public static void main(String[] args)
	{
		List<Products> product_list = new ArrayList<>();
		product_list.add(new Products(001,"HP laptop",50000));
		product_list.add(new Products(002,"Dell laptop",60000));
		product_list.add(new Products(003,"Mac laptop",70000));
		product_list.add(new Products(001,"Coconics laptop",5000));
		product_list.add(new Products(001,"Lenova laptop",9000));
		//mapping products to  a list
//		List<String> product_list2=product_list.stream().filter(s->s.price>10000).map(s->s.name).collect(Collectors.toList());
//		System.out.println(product_list2);
		
		//filtering and printing using the same list
		product_list.stream().filter(product -> product.price> 30000).forEach(product -> System.out.println(product.name+" "+product.price)); 
//		System.out.println(product_list);
		
				
	}
}
