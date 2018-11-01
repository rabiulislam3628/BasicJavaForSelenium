package conditionalStatement;

// if else : if condition true then execute if block or execute else block 

public class IfElseStatement {

	public static void main(String[] args) {
		

		System.out.println("test start");
		
		String browser="Chrome";
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test case execute on Chrome");
			}
	else
		
	{
		System.out.println("Test case execute on Firefox");
			
		}
		System.out.println("test end");
			
		}

	}