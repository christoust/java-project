package array;

public class Multidimmension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[2][2];
		a[0][1]=0;
		a[0][0]=1;
		a[1][0]=2;
		a[1][1]=3;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
				{System.out.print(a[i][j] +" ");}
		
		System.out.println(" ");
		}

	}

}
