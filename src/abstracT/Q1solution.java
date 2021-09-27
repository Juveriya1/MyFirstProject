package abstracT;

abstract class shape{   
	   abstract void print();  
	   void changeShape(){
		   System.out.println("shape changed");
		   }  
	 }  
	//Creating a Child class which inherits Abstract class  
	 class circle extends shape{  
	 void print(){
		 System.out.println("running safely..");
		 }  
	 }



public class Q1solution {

	public static void main(String[] args) {
		shape obj = new circle();  
		  obj.print();  
		  obj.changeShape();  

	}

}
