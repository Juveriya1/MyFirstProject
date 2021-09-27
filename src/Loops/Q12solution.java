package Loops;

import java.util.Scanner;

public class Q12solution {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a gender type: M/F- ");
		String choice=sc.next();
		switch(choice) {
		case "M": System.out.println("Male");
		break;
		case "F": System.out.println("Female");
		break;
		default: System.out.println("wrong choice");
		break;
		}

	}

}
