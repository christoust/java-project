package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Unique {

	public static void main(String[] args) {
//		System.out.println("Enter students article");
//		Scanner sc = new Scanner(System.in);
		
//		String in = sc.nextLine();
//		String[] allwords=in.split("\\s");
//		System.out.println(allwords);
//		
//	  List<String> words= Arrays.stream(allwords).filter(string->!string.isEmpty()).collect(Collectors.toList());
//	  
//	  List<String> uniquewords= words.stream().map(string ->string.toLowerCase()).distinct().sorted().collect(Collectors.toList());
//	  
//	  System.out.println(words.size());
//	  System.out.println(uniquewords.size());
//	  System.out.println(uniquewords);
		
		
//		List<String> myList = new ArrayList<String>(Arrays.asList(in.split(" ")));
//		System.out.println(myList);
////		System.out.println(mylist.get(1));
//		System.out.println("No of words in article"+myList.size());
//		 myList.stream().distinct().collect(Collectors.toList());
//		for(String a:myList)
//		{
//			System.out.println(a);
//		}
//		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		s = s.replaceAll("[-+^]*,", "");
		List<String> sList = new ArrayList<String>(Arrays.asList(s.split(" ")));
		System.out.println(sList);
		System.out.println("SIZE="+sList.size());
		 List<String> val =sList.stream().map(n->n.toLowerCase()).sorted().distinct().collect(Collectors.toList());
		 System.out.println(val);
		 System.out.println("no of unique ="+val.size());
		 for(int i=0;i<val.size();i++){
			    System.out.println(val.get(i));
			} 
	}




	}


