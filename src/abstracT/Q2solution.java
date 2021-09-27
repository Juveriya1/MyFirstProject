package abstracT;

abstract class Mobile{   
	   abstract void print();  
	   void changeBrand(){
		   System.out.println("Mobile brand changed");
		   }  
	 }  
	//Creating a Child class which inherits Abstract class  
	 class brand extends Mobile{  
		 //we can't create object for abstract class in sub class
		// Mobile m=new Mobile();
		// m.changeBrand();
	 void print(){
		 System.out.println("running safely..");
		 }  
	 }



public class Q2solution {

	public static void main(String[] args) {
		Mobile ob=new brand();
		ob.print();
		ob.changeBrand();

	}

}
