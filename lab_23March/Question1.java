package lab_23March;
import java.util.InputMismatchException;
import java.util.Scanner;

//question 1
public class Question1 {

	
	//method
	public void check() {
		
		//try block
		try {
		Scanner sc=new Scanner(System.in);  //scanner variable
		System.out.println("Enter two integer numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=x/y;
		System.out.println(x+"/"+y+"="+a);
		}
		
		//1st catch block
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		
		//2nd catch block
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		}
	
	//main method
	public static void main(String[] args) {
		Question1 obj=new Question1(); //object
		obj.check();

	}

}
