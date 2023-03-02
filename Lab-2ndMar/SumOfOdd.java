package pattern;
import java.util.Scanner;   
public class SumOfOdd {

	public static void main(String[] args) {  //main method
		int sum=0;
	Scanner sc = new Scanner(System.in);   //scanner reference variable 
		System.out.println("Enter a number: ");
int n=sc.nextInt();  //taking variable
for(int i=0;i<=n;i++) { 
	if(i%2!=0) {
		 sum=sum+i;
	}
}
System.out.println(sum);
	}

}
