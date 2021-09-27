package thisSuper;

public class Q4solution {

	public static void main(String[] args) {
		//Call argument constructor of current class using this()
		@SuppressWarnings("unused")
		A a=new A(10);  

	}

}

class A{  
	A(){
		System.out.println("hello a");
	}  
	A(int x){  
		this();  
		System.out.println(x);  
	}  
}  