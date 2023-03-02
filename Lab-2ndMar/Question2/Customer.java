package pattern;

public class Customer {
	//instance variable
private long accountNumber;
private String accountName;
private float accountBalance;
//methods
void create_account(long accountNumber, String accountName,float accountBalance) {
	this.accountNumber=accountNumber;
	this.accountName=accountName;
	this.accountBalance=accountBalance;
	System.out.println("The new created account is:- ");
	System.out.println("Account number: "+accountNumber+" Account holder's name: "+accountName+" Balance: "+accountBalance);
}
void setAmount(int amount){
	this.accountBalance=amount+accountBalance;
	System.out.println("Updated balance: "+accountBalance);
}
void getAmount(String accountName,float accountBalance) {
	this.accountName=accountName;
	this.accountBalance=accountBalance;
	System.out.println("Account Holder's name: "+accountName+" Account number: "+accountBalance);
}
void withDrawAmount(int amount) {
	this.accountBalance=accountBalance-amount;
	System.out.println("Updated account balance: "+accountBalance);
}
}
