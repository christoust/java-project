package linkedlist;
import java.util.*;


public class Kthlargestnumber {

	
	    public static void main(String[] args) {

	        LinkedList<Integer> list = new LinkedList<>();
	        list.add(3);
	        list.add(1);
	        list.add(7);
	        list.add(5);
	        list.add(8);
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the k value");
	        int k = sc.nextInt();

	        List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).toList();
	        int kthLargest = sortedList.get(k - 1);

	        System.out.println("Original linked list: " + list);
	        System.out.println("Sorted list: " + sortedList);
	        System.out.println(k + "th largest number: " + kthLargest);
	    }
	}


