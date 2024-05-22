package javabasic;

public class WrapperClass {
	public static void main(String args[]){  
		//Converting int into Integer  //Autoboxing
		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a+" "+i+" "+j);  
		
		
		//Converting Integer to int    //Unboxing
//		Integer a=new Integer(3);    
//		int i=a.intValue();//converting Integer to int explicitly  
//		int j=a;//unboxing, now compiler will write a.intValue() internally    
//		    
//		System.out.println(a+" "+i+" "+j);  
		
		}

}
