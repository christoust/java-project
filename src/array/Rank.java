package array;

public class Rank {
	public static void main(String[] args)
	{
		String[] students = {"Alice","Bob","Charlie","David","Eva"};
		int[][] marks = {{80,75,90},{85,70,95},{90,80,85},{75,80,90},{95,90,80}};
		int [] total_marks = new int[5];
		String[][] rank = new String [10][10];
		
		for(int i=0;i<marks.length;i++) {
			int sum=0;
			for(int l=0;l<marks[i].length;l++)
			{
				
				sum=sum+marks[i][l];
			}
			total_marks[i]=sum;
	}
		
		//sorting marks
		int temp=0;
		int n = total_marks.length;
		for(int k=0; k < n; k++){  
            for(int l=1;l < (n-k); l++){  
                     if(total_marks[l-1] < total_marks[l]){  
                            //swap elements  
                            temp = total_marks[l-1];  
                            total_marks[l-1] = total_marks[l];  
                            total_marks[l] = temp;  
                    }  
                     
            }  
	}
		for(int e:total_marks)
		{
			System.out.println(e);
		}	
		for(int )
		
		

}
}
