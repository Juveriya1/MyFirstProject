package Exceptions;

public class Q10solution {

	public static void main(String[] args) {
		// Write a program to generate NumberFormatException
		try {
			String s="abc";  
			@SuppressWarnings("unused")
			int i=Integer.parseInt(s);
		}catch(NumberFormatException ne) {
			ne.printStackTrace();
		}

	}

}
