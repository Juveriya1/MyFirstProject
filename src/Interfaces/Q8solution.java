package Interfaces;

//public doesn't need in interface as it's implicitly public// 
interface intrfcA{
	void msg();
}

class A1 implements intrfcA{
	public void msg() {
		System.out.println("Hello");
	}
}

public class Q8solution {

	public static void main(String[] args) {
		A1 ob=new A1();
		ob.msg();

	}

}
