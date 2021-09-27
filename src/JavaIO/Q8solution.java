package JavaIO;
import java.io.*;  
public class Q8solution {

	public static void main(String[] args)throws Exception {
		// Write text to a .txt file using BufferedWriter
		FileWriter writer = new FileWriter("D:\\testout.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to JalaTechnogies.");  
	    buffer.close();  
	    System.out.println("Success");  

	}

}
