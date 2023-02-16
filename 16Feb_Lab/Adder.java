package lab;
class Arithmetic{  //super class
	void add(int a,int b) {   //add method
		int sum=a+b; 
		System.out.println(sum);
	}
}
public class Adder extends Arithmetic{   //base class

	public static void main(String[] args) {  //main method
		Adder ob=new Adder();  //object
		System.out.println("The sum of 2 integers: ");
		ob.add(50, 96);
		

	}

}
