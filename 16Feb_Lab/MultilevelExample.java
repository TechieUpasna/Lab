package lab;
//this is a multilevel type of inheritance
class A{   //super class
	int a=5;
	int b=6;
}
class B extends A{   //derived class for A and super class for C 
		int add=a+b;
	
}
class C extends B{  //derived class
	void display() {
		System.out.println("The sum of a and b: "+add);
	}
}
public class MultilevelExample {   //main class

	public static void main(String[] args) {   //main method  
		C abc=new C();  //object
		abc.display();

	}

}
