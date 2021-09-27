package Loops;

import java.util.Scanner;
import java.lang.Math;  


public class Q7solution {

	public static void main(String[] args) {
		int num,check,count=0,sum1=0,digit;

		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter number: ");   
		num=sc.nextInt();  
		check=num;
		while (num>0) {
			digit=num%10;
			count+=1;
		    num=num/10;
		    num=check;
		}
		while (num>0) {
		    digit=num%10;
		    sum1=(int)(sum1+(Math.pow(digit,count)));
		    num=num/10;
		}
		System.out.println(sum1);
		if (sum1==check)
		    System.out.println("number is armstrong");
		else 
		    System.out.println("number is not armstrong");


		
			}   


}
