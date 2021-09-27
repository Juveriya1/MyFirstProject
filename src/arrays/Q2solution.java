package arrays;

public class Q2solution {

	public static void main(String[] args) {
		int ar[]=new int[] {12,23,21,90,76};
		int len=ar.length;
		int avg=0,sum=0;
		for(int i=0;i<len;i++) {
			sum=sum+ar[i];
			avg=sum/len;
		}
		System.out.println("average value of array is "+avg);

	}

}
