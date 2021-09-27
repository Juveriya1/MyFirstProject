package AccessModifiers;

public class Q3solution {
	public static void main(String[] args) {
		subclas ob=new subclas();
		ob.method();
	}
}
class subclas{
	protected int a=10;
	protected void method() {						//protected method
	System.out.println(a);							//protected field
	}
}
