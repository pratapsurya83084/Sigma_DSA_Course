
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    // deep copy constructor
    public Address(Address addr) {
        this.city = addr.city;
    }
}







class Student implements Cloneable {
    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() {
        // manualy create a new Address (deep copy)
        return new Student(this.name, new Address(this.address));
    }

}



public class DeepCopy {

    public static void main(String[] args) {
        Address addr = new Address("Mumbai");
        Student s1 = new Student("Pratap", addr);

        Student s2 = (Student) s1.clone(); // Deep copy

        s2.name = "Amit";
        s2.address.city = "Pune"; // will not affect s1

        System.out.println(s1.name + " - " + s1.address.city); // Pratap - Mumbai
        System.out.println(s2.name + " - " + s2.address.city); // Amit - Pune

    }
}
