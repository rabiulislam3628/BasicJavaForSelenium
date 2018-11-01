package dataTypeDemo;

public class IntDemo {

	//be care full to used the range of date 
	
	public static void main(String[] args) {
		
		byte marks=  100;  //byte range 127 to 128
		System.out.println("my English marks are " +marks );
		
		//byte total_money= 150;// here is error because byte cross his size 128 to 150
		short total_money =150; //keep the mouse on 150 and convert to double
		
		System.out.println("my money is  "+total_money);
		
		int mymobile=347658362;
		System.out.println("my mobile no is  "+ mymobile);
		
		long mymobile1=347658362;
		System.out.println("my mobile no is  "+ mymobile1);
		
		//good practics java most of the time  follow the int long vlue to  reduce the error but when need for 2 digit code, used  byte code for memory allocatin purpose .
		
		
		

	}

}
