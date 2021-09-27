package Interfaces;

interface interfc{
	void sum();
}

interface interf{
	void multi();
}

class demo implements interfc,interf{
	int a=10,b=20;
	public void sum() {
		System.out.println(a+b);
	}
	public void multi() {
		System.out.println(a*b);
	}
}
public class Q4solution {

	public static void main(String[] args) {
		demo ob=new demo();
		ob.sum();
		ob.multi();

	}

}
