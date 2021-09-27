package Loops;

import java.util.Scanner;

public class Q11solution {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		switch(num%2) {
		case 0: System.out.println("even number");
		break;
		case 1: System.out.println("odd number");
		break;
		}

	}

}
