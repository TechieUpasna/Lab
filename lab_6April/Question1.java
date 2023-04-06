package lab_6April;
import java.io.*;
import java.util.Scanner;

//Question 1
/*create a java program to read n print the content to/from the file
Note: display two options 1 for store data 2 for print data,
if user press 1 then read the data from console and store it in file, 
if user press 2 print the data from the file*/

public class Question1 {
	public static void main(String[] args) {  //main method
		Scanner sc=new Scanner(System.in);   //scanner object
		System.out.println("Choose a number from 1 or 2:- ");
		System.out.println("PRESS 1 if you want to store the data or PRESS 2 to read the content of the data");
		int num=sc.nextInt();
		if(num==1) {
			//option 1
		try {
			FileOutputStream f=new FileOutputStream("D:\\store.txt");  //destination
			System.out.println("Enter the data that to be stored in the file: ");
			String s=sc.next();  //taking input
			byte b[]=s.getBytes();  //converting string into byte
			f.write(b);
			f.close();
			sc.close();
			System.out.println("Done!");
		}
		catch(Exception e) {
			System.out.println(e);
		}}
		
		//option 2
		else {
			try {
				FileInputStream f=new FileInputStream("D:\\store.txt");
				int i=0;
				while((i=f.read())!=-1) {
					System.out.print((char)i);
				}
				f.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}

	}

}



	
