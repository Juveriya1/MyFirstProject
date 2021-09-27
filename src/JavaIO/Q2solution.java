package JavaIO;

import java.io.FileOutputStream;  

public class Q2solution {

	public static void main(String[] args) {
		// Write a program to write text to .txt file using OutputStream
		try{    
            FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
            fout.write(65);    
            fout.close();    
            System.out.println("success...");    
           }catch(Exception e){
        	   System.out.println(e);
        	   }  

	}

}
