package thisSuper;

public class Q3solution {

	public static void main(String[] args) {
		// Call constructor of the current class using this()
		@SuppressWarnings("unused")
		A1 a=new A1();

	}

}

class A1{  
	A1(){  
		this(5);  
		System.out.println("hello a");  
	}  
	A1(int x){  
		System.out.println(x);  
	}  
}  