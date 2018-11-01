package dataTypeDemo;

public class FloatDemo {

	public static void main(String[] args) {
		
		float my_MARKS=(float) 60.30;  //type custing 
		float my_maths_marks=63.25f; //mention  f for floating vlue 
		
	double my_english_marks=230.36;
	
	System.out.println("my marks is "+ my_MARKS);
	
	System.out.println(my_maths_marks);
	System.out.println(my_english_marks);
	
	
	//downcasting= when convertign hight value to lowest value
	int a=(int)36.36;// converting double to int , only it is print int part 36
	System.out.println(a);
	}

}
