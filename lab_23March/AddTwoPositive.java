package lab_23March;
import java.util.Scanner;

public class AddTwoPositive {

	static void  AddTwoPositive(int x, int y) throws ArithmeticException{
		if(x>0 && y>0) {
			int sum=x+y;
			System.out.println("sum="+sum);
		}
		else {
			throw new ArithmeticException("Non-positive integer sent");
		}
	}
	//main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter 2 integers");
		int a=sc.nextInt();
		int y=sc.nextInt();
		try {
			AddTwoPositive(a,y);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Program executed");
		}

	}

}
