package conditionalStatement;

public class IfElseIfDemo {

public static void main(String[] args) {
		

		System.out.println("test start");
		
		String browser="IE"; // below stamement only meet IE
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test case execute on Chrome");
			}
	else if (browser.equalsIgnoreCase("Firefox"))
		
	{
		System.out.println("Test case execute on Firefox");
			
		}
	else if (browser.equalsIgnoreCase("IE"))
	{
	System.out.println("Test case execute on IE");
	}
	else
	{
		System.out.println("Kindly provide valide browser name ");
	}
		System.out.println("test end");
			
		}

	}
