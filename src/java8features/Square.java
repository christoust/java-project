package java8features;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Square {
	public static void main(String[] args)
	{
		List<Integer> s = Arrays.asList(1,2,3,4);
		List<Integer> square_list = s.stream().filter(number->number%2==0).map(number->number*number).collect(Collectors.toList());
		System.out.println(square_list);
	}
	

}
