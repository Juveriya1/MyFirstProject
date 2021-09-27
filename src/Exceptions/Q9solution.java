package Exceptions;

public class Q9solution {

	public static void main(String[] args) {
		// Write a program to generate ArrayIndexOutOfBoundException
		try {
			int a[]=new int[5];    
            a[5]=30;   
			
		}catch(ArrayIndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}

	}

}
