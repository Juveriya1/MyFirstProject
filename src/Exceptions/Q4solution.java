package Exceptions;



public class Q4solution {

	public static void main(String[] args) {
		// Write a program with multiple catch blocks
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
		}

	}

}
