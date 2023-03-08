package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Names_count {
	public static void main(String[] args) {
	List<String> names = Arrays.asList("Blesson","Anikuttan","Anikuttan");
//	long ans = names.stream().collect(Collectors.counting());
//	int ans= names.stream().mapToInt(List::size).sum();
//	int ans = names.stream().reduce(0, (i, l) -> i + l.size(), (i, j) -> i + j);
//
//	System.out.println(ans)
//	}
	Map<String,Long> count =names.stream().map(city->city.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(count);

}
}
