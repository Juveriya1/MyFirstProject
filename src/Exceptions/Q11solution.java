package Exceptions;

public class Q11solution {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// Write a program to generate NullPointerException
		try {
			String s=null;  
			System.out.println(s.length());
		}catch(NullPointerException e) {
			e.printStackTrace();
		}

	}

}
