package Exceptions;

@SuppressWarnings("serial")
class AgeException  extends Exception  
{  
    public AgeException (String str)  
    {   
        super(str);  
    }  
}  

class CustomException  
{   
     void validate (int age) throws AgeException{    
       if(age < 18){  
  
        // throw an object of user defined exception  
        throw new AgeException("age is not valid to vote");    
    }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }    
  
}
public class Q6solution {

	public static void main(String[] args) {
		//Write a program to create your own exception
		CustomException ob=new CustomException();
		 try  
	        {  
	            // calling the method   
	            ob.validate(13);  
	        }  
	        catch (AgeException ex)  
	        {  
	            System.out.println("Caught the exception");  
	    
	            // printing the message from InvalidAgeException object  
	            System.out.println("Exception occured: " + ex);  
	        }  

	}

}
