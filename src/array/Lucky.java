package array;
import java.util.Scanner;
//import java.util.regex.*;
public class Lucky {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int flag1=0;
	int flag2 = 0;
	int flag3 = 0;
//	System.out.println(Pattern.matches("[3][6][9]?", "123"));
	
	int rem = 0;
	do {
	rem = num%10;
	num=num/10;
//	System.out.println(rem);
	if(rem==3)
	{
		flag1=1;
	}
	if(rem==6)
	{
	flag2=1;
}
	else {
		
	}
	if(rem==9)
	{
		flag3 = 1;
	}
	}while(num!=0);
	if(flag1==1&flag2==1&flag3==1)
	{
		System.out.println("Lucky number");
	}
	else
	{
		System.out.println("Not lucky");
	}
}
}

