package AccessModifiers;

public class Q2solution {

	public static void main(String[] args) {
		abc ob=new abc();
		ob.func();
	}
}
class abc{
	int a=10;
	void func() {
		System.out.println(a);
	}

}
