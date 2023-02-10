package lab;

public class Object {
	void sum()   //declared a function
	{
		int a=10;  //declaration
		int b=15;
		int sum=a+b;
		System.out.println("The sum of number: "+sum);
	}

	public static void main(String[] args) {
		Object ob=new Object();  // created an object 
		ob.sum();   //function called 
	}

}
