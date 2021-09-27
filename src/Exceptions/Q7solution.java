package Exceptions;

public class Q7solution {

	public static void main(String[] args) {
		//Write a program with finally block
		try {
			int a[]=new int[5];    
            a[5]=30/0; 
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {  
			System.out.println("finally block is always executed");  
		}    


	}

}
