package Constructors;

public class Q5solution {

	public static void main(String[] args) {
		// Try to call the constructor multiple times with the same object
		@SuppressWarnings("unused")
		multicall ob=new multicall();
		//multicall ob=new multicall();			error,can't call the constructor multiple times with the same object

	}

}

class multicall{
	multicall(){
		System.out.println("default");
	}
}