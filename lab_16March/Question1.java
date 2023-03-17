package lab_16March;
import java.util.Scanner;
public class Question1 {
// Write a java program to find the maximum occurring character in a string.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);   //scanner object
		System.out.println("Enter a string:-");
		 String str = sc.next();  //taking input  
	        int[] f = new int[str.length()];  
	        char minChar = str.charAt(0), maxChar = str.charAt(0);  
	        int i, j, min, max;          
	          
	        //Converts given string into character array  
	        char string[] = str.toCharArray();  
	          
	        //Count each word in given string and store in array frequency  
	        for(i = 0; i < string.length; i++) {  
	            f[i] = 1;  
	            for(j = i+1; j < string.length; j++) {  
	                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
	                    f[i]++;  
	                      
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                }  
	            }  
	        }  
	          
	        //Determine minimum and maximum occurring characters  
	        min = max = f[0];  
	        for(i = 0; i <f.length; i++) {  
	              
	            //If min is greater than frequency of a character   
	            //then, store frequency in min and corresponding character in minChar  
	            if(min > f[i] && f[i] != '0') {  
	                min = f[i];  
	                minChar = string[i];  
	            }  
	            //If max is less than frequency of a character   
	            //then, store frequency in max and corresponding character in maxChar  
	            if(max < f[i]) {  
	                max = f[i];  
	                maxChar = string[i];  
	            }  
	        }  
	          
	        System.out.println("Minimum occurring character: " + minChar);  
	        System.out.println("Maximum occurring character: " + maxChar);  
	    }  
	 
	}


