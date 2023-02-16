package lab;
class Teacher{  //base class
	String designation;       //data members
	String college_properties;
	void work() {  //method
		
	}
}
class IT_teacher extends Teacher{  //sub class for Teacher and base class for Math_teacher and Soft_skill
	String college_name;
	
}
class Math_teacher extends IT_teacher{  //sub class
	void show() {  //method
		System.out.println(designation="B.Ed");
	}
}
class Soft_skill extends IT_teacher{  //sub class
	void display() {  //method
		System.out.println(college_name="VMLG college");
	}
}
public class Question3 {  //main class

	public static void main(String[] args) {  // main method
	Soft_skill soft=new Soft_skill(); //object
	soft.display();
	Math_teacher math=new Math_teacher(); //object
	math.show();
	}

}
