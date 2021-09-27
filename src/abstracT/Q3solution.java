package abstracT;

abstract class drawshape{   
	   abstract void print();  
	   void changeShape(){
		   System.out.println("shape changed");
		   }  
	 }  
	//Creating a Child class which inherits Abstract class  
	 class drawcircle extends drawshape{  
		// drawcircle ob=drawcircle();   
	 void print(){
		 System.out.println("running safely..");
		 }  
	 }

public class Q3solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
