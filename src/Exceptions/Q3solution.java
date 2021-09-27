package Exceptions;

public class Q3solution {

	public static void main(String[] args) {
		// Write a method which throws exception, Call that method in main class without try block
		errorfunc();

	}
	static void errorfunc(){
		int a=10,b=0;
		int c=a/b;
		System.out.println(c);
	}

}
