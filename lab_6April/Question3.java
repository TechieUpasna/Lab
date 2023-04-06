package lab_6April;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


//main class
public class Question3 implements Serializable {
transient int no;
transient String name;
long mob;
//method
public Question3(int no,String name,long mob) {
	this.no=no;
	this.name=name;
	this.mob=mob;
}
//main method
	public static void main(String[] args) {
		Question3 q=new Question3(100,"Upasna",7412589630L);  //object of main class
		
		//serialization
		try {
			FileOutputStream f=new FileOutputStream("D://store.txt");
			ObjectOutputStream ob=new ObjectOutputStream(f);
			ob.writeObject(q);
			ob.flush();
			ob.close();
			f.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		//deserialization
		try {
			FileInputStream e=new FileInputStream("D://store.txt");
			ObjectInputStream in=new ObjectInputStream(e);
			Question3 obj1=(Question3) in.readObject();
			in.close();
			System.out.println(obj1.no+" "+obj1.name+" "+obj1.mob);
	}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Done!");

}}
