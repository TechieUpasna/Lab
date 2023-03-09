package lab9March;
import java.util.Scanner;
public class Question3 {//main class
	
	public static void main(String[] args) {//main method
		
		Scanner sc= new Scanner(System.in);//taking input from user
		
		int a[]=new int [5];//array declared
		System.out.println("enter the element of an array");
		for(int i=0;i<a.length;i++) {//to print the element
			a[i]=sc.nextInt();
		}
		System.out.println("odd position array:");
		for(int i=0;i<a.length;i=i+2) {//loop for the array incrementing value of i by 2
			System.out.print(a[i]+" ");//print the odd position number
		}
	}
	}


