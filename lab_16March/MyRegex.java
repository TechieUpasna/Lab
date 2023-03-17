package lab_16March;
import java.util.regex.*;
 class MyRegex {   //non public class

	
//Write a class called MyRegex which will contain a string pattern.
//You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address.
	 
	 public static boolean validation(String ip)  
	 {  
	 //regex for digit from 0 to 255.  
	 String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";  
	 // Regex for a digit from 0 to 255 and followed by a dot, repeat 4 times. this is the regex to validate an IP address.  
	 String regex= zeroTo255 + "\\."+ zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;  
	 // Compile the ReGex  
	 Pattern p = Pattern.compile(regex);  
	 //if the IP address is empty return false  
	 if (ip == null)   
	 {  
	 return false;  
	 }  
	 //pattern class contains matcher() method to find matching between given IP address and regular expression.  
	 Matcher m = p.matcher(ip);  
	 // Return if the IP address matched the ReGex  
	 return m.matches();  
	 }  
	 
	 
	public static void main(String[] args) {   //main method
		
		//000.12.12.034
		String str1 = "000.12.12.034";  
		System.out.println(validation(str1));   
		
		//121.234.12.12
		String str2="121.234.12.12";
		System.out.println(validation(str2));
		
		//23.45.12.56
		String str3="23.45.12.56";
		System.out.println(validation(str3));
		
		
		//00.12.123.123123.123
		String str4="00.12.123.123123.123";
		System.out.println(validation(str4));
		
		
		//122.23
		String str5="122.23";
		System.out.println(validation(str5));
		
		//Hello.IP
		String str6="Hello.IP";
		System.out.println(validation(str6));
	}

}
