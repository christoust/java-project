package fileoperations;
import java.io.FileInputStream;  

public class File_read {
	
	   
	     public static void main(String args[]){    
	          try{    
	            FileInputStream fin=new FileInputStream("D:\\New.txt");    
//	            int i=fin.read();  
	            int i=0;    
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }    
//	            System.out.print((char)i);    
	  
	            fin.close();    
	            
	          }catch(Exception e){System.out.println(e);}    
	         }    
	        }  

