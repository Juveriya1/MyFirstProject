package JavaIO;
import java.io.FileReader; 
public class Q5solution {

	public static void main(String[] args)throws Exception {
		// Write a program to read text from .txt file using FileReader
		 FileReader fr=new FileReader("D:\\testout.txt");    
         int i;    
         while((i=fr.read())!=-1)    
         System.out.print((char)i);    
         fr.close();    

	}

}
