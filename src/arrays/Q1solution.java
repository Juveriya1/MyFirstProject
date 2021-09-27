package arrays;

import java.util.Scanner;

public class Q1solution {

	public static void main(String[] args) {
		addarray();

	}

	static void addarray() {
		int ar[]=new int[5];
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("array element "+i+" ");
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.println("array element "+i+" "+ar[i]);
		}
	}
}
