
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}





class Student implements Cloneable {
    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

}



public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        Address adress = new Address("Mumbai");
        Student s1 = new Student("Pratap", adress);
        Student s2 = (Student) s1.clone(); // Shallow copy

        s2.name = "Amit";
        s2.address.city = "Pune"; 

        System.out.println(s1.name + " " + s1.address.city); // Pratap Pune
        System.out.println(s2.name + " " + s2.address.city); // Amit Pune
    }

}
