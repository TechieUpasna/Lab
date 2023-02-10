package lab;
import java.util.Scanner;
public class SmallestNum {
	public static void main(String args[]) {  //main method
		Scanner sc = new Scanner(System.in); 
		System.out.println("A= ");
		int a= sc.nextInt();  //taking input
		System.out.println("B= ");
		int b= sc.nextInt();
		System.out.println("C= ");
		int c= sc.nextInt();
		if(a<b&&a<c) { //condition   
				System.out.println("A is smallest of all three");
			}
		else if(b<c) {  
		  System.out.println("B is the smallest number");}
		else { System.out.println("C is the smallest number");}
			
		}
		}
	


