package lab_6April;
import java.io.*;


//Question2
//Write a Java program to read contents from a file into byte array.

public class Question2 {
public static void main(String[] args) {
	
	try {
		FileInputStream f=new FileInputStream("D:\\Code.txt");   //source file
		BufferedInputStream b=new BufferedInputStream(f);
		int i;
		System.out.println("Byte Array: ");
		while((i=b.read())!=-1) {
			System.out.print(i+", ");
		}
		
		f.close();
		b.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}


	
