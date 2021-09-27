package Exceptions;

public class Q2solution {

	public static void main(String[] args) {
		//Handle the Arithmetic exception using try-catch block
		int a=10,b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
