package conditionalStatement;

public class IfDemo {
	
//it is check the condition if condition is true then execute the code
	
	public static void main(String[] args) {
		System.out.println("test start");
		
	int a= 90;
	if (a<100) {
		System.out.println("first a value is " +a);
		
	}
	int b=50;
	if (b<40)// here  b value is less then 50 so condition is not meet so, it is not execute 
	{
		System.out.println("second b value is "+b);
		
	}
	System.out.println("test end");
		
	}

}
