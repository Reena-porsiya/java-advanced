package oopsconcept;

abstract class Bike{  
	  abstract void run();  
	}  
public class AbstractClass  extends Bike{
	
	void run(){
		System.out.println("running safely");
		}  
	public static void main(String args[]){  
		
	 Bike obj = new AbstractClass();  
	 obj.run();  
	}  
	}  


