package lab_13April;

import java.util.ArrayList;
import java.util.Iterator;


public class Question1 {
	//arraylists
	ArrayList<Integer>A1=new ArrayList<Integer>();
	ArrayList<Integer> A2=new ArrayList<Integer>();
	
	//method
public void storeOddNumber(int N) {
	
	System.out.println("ArrayList (A1) is created");
	for(int i=2;i<=N;i++) {
		if(i%2!=0) {
			A1.add(i);
		}
		
	}

}

public void printOddNumber() {
	Iterator itr=A1.iterator();
	
	for(int i=0;i<A1.size();i++) {
		int j=i*5;
		A2.add(j);
	}
	System.out.println(A2);
	System.out.println("ArrayList (A2) is created");
}

public void retrieveOddNumber(int N) {
	if(A1.contains(N)) {
		System.out.println(N);
	}
	else {
		System.out.println(0);
	}
}
//main method
	public static void main(String[] args) {

		Question1 a=new Question1();  //object
		a.storeOddNumber(50);
		a.printOddNumber();
		a.retrieveOddNumber(25);
	}

}

