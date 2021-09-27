package JavaIO;
import java.io.*;  
public class Q3solution {

	public static void main(String[] args) {
		// Read text from a .txt file using BufferedInputStream
		try{    
		    FileInputStream fin=new FileInputStream("D:\\testout.txt");    
		    BufferedInputStream bin=new BufferedInputStream(fin);    
		    int i;    
		    while((i=bin.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    bin.close();    
		    fin.close();    
		  }catch(Exception e){System.out.println(e);}    

	}

}
