package array;

public class Positive_negative_numbers_array {

	public static void main(String[] args) {
		int a[]= {4,-4,6,8,-9,0,4,-7,56};
		// TODO Auto-generated method stub
		int pos[]=new int[a.length];
		int neg[]=new int[a.length];
		int positive=0;
		int negative=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>0)
			{
				pos[i]=a[i];
				positive+=1;
			}
			else
			{
				neg[i]=a[i];
				negative+=1;
			}
		}
		System.out.println("no of positive numbers= "+positive);
		System.out.println("no of negative numbers= "+negative);
		for(int j :pos)
		{
			System.out.println(j);
		}
	}

}
