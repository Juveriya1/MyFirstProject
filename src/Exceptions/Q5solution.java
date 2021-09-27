package Exceptions;

public class Q5solution {

	public static void main(String[] args) {
		// Write a program to throw exception with your own message
		validate(13);  

	}
	static void validate(int age) {  
        if(age<18) {    
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  

}
