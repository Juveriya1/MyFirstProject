package JavaIO;

import java.io.*; 

public class Q4solution {

	public static void main(String[] args) throws Exception {
		// Read text from a .txt file using BufferedOutputStream
		FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Welcome to file system.";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success"); 

	}

}
