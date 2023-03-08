package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class City_name {
	public static void main(String[] args)
	{
		List<String> city = Arrays.asList("Kottayam","Tvm","thiruvalla");
		List<String> t = city.stream().map(s->s.toUpperCase()).filter(s->s.startsWith("T")).collect(Collectors.toList());
		System.out.println(t);
		
	}

}
