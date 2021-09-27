package Operators;

public class Q5solution {

	public static void main(String[] args) {
		int a=10,b=20,c=5;
		if (a==b && a>c) {					//&& operator
			System.out.println("and operator && executed only if both the condition true");
		}
		if(a==b || a>c) {				// || operator
			System.out.println("or operator || executed, if one condition is true");
		}
	// ! not operator
			System.out.println((!(a<b))+" not operator ! is used to reverse the result ie. if true returns false and if false erturns true");
	}

}
