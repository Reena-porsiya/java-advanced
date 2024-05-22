package javabasic;

class Animals{  
String color="white";  
}  
class Dogs extends Animals{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}
public class SuperKeyword {
	public static void main(String args[]){  
		Dogs d=new Dogs();  
		d.printColor();  
		}

}
