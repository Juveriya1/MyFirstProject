package thisSuper;

public class Q2solution {

	public static void main(String[] args) {
		Design d=new Design();  
		d.printShape();  

	}

}

class Figure{  
	String shape="rectangle";  
}  

class Design extends Figure{
	String shape="circle";  
	void printShape(){  
		System.out.println(shape);					//prints shape of Design class  
		System.out.println(super.shape);			//prints shape of Figure class  
	}  
}  