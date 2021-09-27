package JavaIO;
import java.io.FileWriter;  
public class Q6solution {

	public static void main(String[] args) {
		// Write a program to write text to .txt file using FileWriter
		 try{    
	           FileWriter fw=new FileWriter("D:\\testout.txt");    
	           fw.write("Welcome to JalaTech.");    
	           fw.close();    
	          }catch(Exception e){
	        	  System.out.println(e);
	        	  }    
	          System.out.println("Success...");    

	}

}
