package dataTypeDemo;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class VariableDemo1 {
	//Facts : local variable contain garbase value.
	//Global variable contains null value /default values ,when we did not declear  Global variable 

	static int mynumber;
	
	//Globle variabe put on under the public class variable it is not under the main methed
	public static void main(String[] args) {
		
		//int a;  //this is local variable , it is can not run because a value is not defined yet
		int a= 0;
		
	System.out.println(a);
	System.out.println(mynumber);
	
		//int by defult vlue is always 0

	}

}
