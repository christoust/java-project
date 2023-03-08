package array;
import java.util.*;

public class Palindrome {
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  int rem = 0;
	  int rev = 0;
	  while(num!=0)
	  {rem = num%10;
	  rev = rev*10+rem;
	  num = num/10;}
	  System.out.println(rev);
	  if(num==rev)
	  {
		  System.out.println(" pallindrome");
	  }
	  else
	  {
		  System.out.println("Not pallindrome");
	  }
	  String s  = sc.next();
	  
	  for(int i=s.length();i>=0;i++)
	  {
		  String s = 
	  }
	}
}
