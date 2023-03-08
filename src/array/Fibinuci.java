package array;
import java.util.Scanner;
public class Fibinuci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f=0;
		int s=1;
		int c=0;
		System.out.println(f);
		System.out.println(s);
		for(int i=2;i<=n;i++)
		{
			c=f+s;
			System.out.println(c);
			f=s;
			s=c;
		}
	}

}
