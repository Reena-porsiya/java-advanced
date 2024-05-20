package javaclass;

public class MemberInnerClass {
	
	    private int outerField = 10;

	    // Member Inner Class
	    class Inner {
	        void display() {
	            System.out.println("Value of outerField: " + outerField);
	        }
	    }

	    public static void main(String[] args) {
	    	MemberInnerClass outer = new MemberInnerClass();
	    	MemberInnerClass.Inner inner = outer.new Inner();
	        inner.display();
	    }
	}



