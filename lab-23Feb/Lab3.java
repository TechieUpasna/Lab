package lab;

class Sports{    //super class
    String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{    //sub class
    
    String getName(){
        return "Soccer Class";
    }
    // Write your overridden getNumberOfTeamMembers method here
   
void getNumberOfTeamMembers () {
       System.out.println( "Each team has 11 players in " + getName() );
}
}
public class Lab3{    //main class
    
    public static void main(String []args){    //main method
    	//objects
        Sports sp = new Sports();
        Soccer so = new Soccer();
        System.out.println(sp.getName());
        sp.getNumberOfTeamMembers();
        System.out.println(so.getName());
        so.getNumberOfTeamMembers();
    }
}