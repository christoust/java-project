package module1_practice_questions;

public class Merge_array {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int [] b = {6,7,9,12};
		int l = b.length+a.length;
		
		int [] res = new int[9];
		
		
		int k = 0;
	    for(int i=0;i<l;i++)
	    {
	    	res[i]=a[i];
	    	if(i>=a.length)
	    	{
//	    		   
//	    			   
//	    		   
	    		   res[i]=b[k];
	    		   k++;
	        }
	    }
	    for(int j:res)
	    {
	    	System.out.println(j);
	    }
		
	}
}

