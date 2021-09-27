package Loops;

import java.util.Scanner;

public class Q9solution {

	public static void main(String[] args) {
		int digit,sum=0,temp;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		  int num=sc.nextInt(); 
		  
		  temp=num;    
		  while(num>0){    
		   digit=num%10;   
		   sum=(sum*10)+digit;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		  

	}

}
