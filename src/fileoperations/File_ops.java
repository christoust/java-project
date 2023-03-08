package fileoperations;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class File_ops  {

		public static void main(String arg[]) throws Exception{
		     int count=0;
		     String line;
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter file name");
			 String s=sc.next();
			 
			 FileOutputStream fout=new FileOutputStream(s);    
             System.out.println("ENTER TEXT:");
//			 String s1=sc.next();
             StringBuilder sb = new StringBuilder();
             InputStreamReader r=new InputStreamReader(System.in);
             BufferedReader br=new BufferedReader(r);   
             
//             byte b[]=br.getBytes();//converting string into byte array    
//             fout.write(b); 
//             String line;
             while ((line = br.readLine()) != null) {
                 sb.append(line + System.lineSeparator());
             }
               
             System.out.println("success..."); 
             fout.close();  
			 
//             FileReader file = new FileReader(s);  
//             BufferedReader br = new BufferedReader(file);  
       
			 

             FileReader file1 = new FileReader(s);  
             BufferedReader br1 = new BufferedReader(file1);  
       
             //Gets each line till end of file is reached  
             while((line = br1.readLine()) != null) {  
                 //Splits each line into words  
                 String words[] = line.split("");  
                 //Counts each word  
                 count = count + words.length;  

		
	}
             System.out.println("no of words:"+count);
             br1.close();
		}
}