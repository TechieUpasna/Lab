package lab_13April;

import java.util.ArrayList;
import java.util.Iterator;



public class Person {
int Sno,age;
String name;

public Person(int Sno,String name,int age) {
	this.Sno=Sno;
	this.name=name;
	this.age=age;
}

//main method
	public static void main(String[] args) {
		
		//objects
		Person b=new Person(1,"Riya",25);
		Person b1=new Person(2,"tia",29);
		Person b2=new Person(3,"siya",21);
		Person b3=new Person(4,"Upasna",20);
		Person b4=new Person(5,"Sam",24);
		Person b5=new Person(6,"Ram",25);
		Person b6=new Person(7,"Chikki",20);
		Person b8=new Person(8,"Mick",27);
		Person b9=new Person(9,"Bobby",52);
		Person b10=new Person(10,"Yashika",12);
		
		//adding them into arraylist
		ArrayList<Person> obj=new ArrayList<Person>();
		obj.add(b);
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		obj.add(b4);
		obj.add(b5);
		obj.add(b6);
		obj.add(b8);
		obj.add(b9);
		obj.add(b10);
		
		
		
		//printing them
		for( Person a:obj) {
			System.out.println(a.Sno+" "+a.name+" "+a.age);
		}

	}

}
