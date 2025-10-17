
//class for private  encapulation
class User {
    private String username;
    private int rollno;

    // setter values method
    void setValues(String username, int rollno) {
       this.username = username;
        this.rollno = rollno;
    }

    // gatter method

    int gateValues() {
    return rollno;
    }

    String gatName() {
    return username;
    }
}


public class Encapsule {
    public static void main(String[] args) {

        /// create user object and gate method

        User obj1 = new User();
        obj1.setValues("pratap", 33); // setters done 

        // System.out.println(obj1.username + " "+ obj1.rollno); // this print without private specifier

        System.out.println("username : " + obj1.gateValues() + " rollno : " + obj1.gatName()); // pratap   33
   
        
    }
}
