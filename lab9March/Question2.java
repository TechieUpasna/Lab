package lab9March;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);//taking input from the user
		int arr[]=new int[5];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<arr.length;i++){//print the element
		 arr[i]=sc.nextInt();
		}
		 System.out.println("Enter the number: ");
		 int num=sc.nextInt();//the number you want to add
		System.out.println("indices of the elements whose sum is: "+num);
		for(int i=0;i<arr.length;i++){  
		for (int j=i;j<arr.length;j++){
		 if((arr[i]+arr[j])==num){//addition of the number
		  System.out.println(arr[i]+"+"+arr[j]+"="+num);
		}}}
	}

}
