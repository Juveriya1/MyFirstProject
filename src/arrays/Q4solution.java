package arrays;

import java.util.Scanner;

public class Q4solution {

	public static void main(String[] args) {
		

	}

	static void find() {
		int ar[]=new int[] {12,23,21,90,76};
		int len=ar.length;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array element index to be search: ");
		int value=sc.nextInt();
		int flag=0,index=0;
		for(int i=0;i<len;i++) {
			if (value==ar[i]) {
				index=i;
				flag=1;
				break;
			}
		}
		if (flag==1)
			System.out.println("element "+value+" found at index "+index);
		else
			System.out.println("element not found ");
	}

}
