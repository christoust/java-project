package linkedlist;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("foo", "bar", "baz","zab");
		strings.add("hello");
		System.out.println(strings);
		List<String> sortedStrings = strings.stream()
		                                    .sorted()
		                                    .collect(Collectors.toList());
		System.out.println(sortedStrings);

	}

}
