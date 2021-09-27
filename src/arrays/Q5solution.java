package arrays;

import java.util.Scanner;

public class Q5solution {

	public static void main(String[] args) {
		removefunc();

	}
	static void removefunc() {
		int ar[]=new int[] {10,20,30,40,50};
	
		System.out.println("array elements before removing element");
		for(int k=0;k<5;k++) {
			System.out.println("ar["+k+"]="+ar[k]);
		}
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array element to remove from an array: ");
		int num=sc.nextInt();
		//int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==num) {
			for(int j=i;j<ar.length-1;j++) {
				ar[j]=ar[j+1];
			}
			break;
		}
		}
		System.out.println("array after removing element");
		for(int k=0;k<ar.length-1;k++) {
			System.out.println("ar["+k+"]="+ar[k]);
		
	}
		
	}

}
