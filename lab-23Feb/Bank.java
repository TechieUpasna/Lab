package lab;

public class Bank {  //main class and super class 
	float getRateOfinterest(float Rate_of_interest){   
		return Rate_of_interest;
	}
	public static void main(String[] args) {   //main method
Sbi sbi=new Sbi();
System.out.println("SBI : "+sbi.getRateOfinterest()+"%");
Icici icic=new Icici();
System.out.println("ICICI : "+icic.getRateOfinterest()+"%");
Axis axis=new Axis();
System.out.println("AXIS : "+axis.getRateOfinterest()+"%");
	}

}
class Sbi extends Bank{   //sub class
	float getRateOfinterest() {
		return 8;
	}
}
class Icici extends Bank{  //sub class
	float getRateOfinterest() {
		return 7;
	}
}
class Axis extends Bank{   //sub class
	float getRateOfinterest() {
		return 9;
	}
}


