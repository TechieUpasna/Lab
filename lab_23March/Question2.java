package lab_23March;
import java.util.Scanner;
public class Question2 {
 
	
	//method
	static void check()throws Exception{
		Scanner sc=new Scanner(System.in);  //scanner variable
		int x,y;
		System.out.println("Enter 2 numbers:");
		//taking inputs
		x=sc.nextInt();   
		y=sc.nextInt();   
		if(-20<= x && y <=20) {
			throw new Exception("x and y should not be zero");
		}
		else {
			int p=x*y;
			System.out.println(p);
		}
	} 
	//main method
	public static void main(String[] args) throws Exception{
		check();

	}

}
