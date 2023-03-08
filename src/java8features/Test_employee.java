package java8features;

import java.util.ArrayList;
import java.util.Comparator;
//import java.util.Collection;
//import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test_employee {
	//peek sorted reserve
	public static void Main(String[] args)
	{
		List<Employee> s = new ArrayList<Employee>();
		s.add(new Employee("123", "Ani", 50000));
		s.add(new Employee("121","Anu", 60000));
		s.add(new Employee("124","Anamika", 160000));
//		Collections.sort(s);
//		for(Employee a:s)
//		{
//			System.out.println(a.emp_name+" "+a.salary);
//		}
		List<Employee> res = s.stream().filter(s->s.g)
		
	}

}
