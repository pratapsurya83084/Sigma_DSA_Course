// Base class (Single Inheritance)
class Person {
    void info() {
        System.out.println("I am a person");
    }
}

// Derived class (Multilevel)
class Employee extends Person {
    void empDetails() {
        System.out.println("Employee details");
    }
}

// Interface 1 (Multiple Inheritance)
interface Sports {
    void play();
}

// Interface 2
interface Hobbies {
    void hobby();
}

// Class implementing multiple interfaces (Hybrid Inheritance)
class Manager extends Employee implements Sports, Hobbies {
    public void play() {
        System.out.println("Manager plays football");
    }

    public void hobby() {
        System.out.println("Manager loves painting");
    }
}



public class HybridInheritanceExample {
    public static void main(String[] args) {
        Manager m = new Manager();
        
        // From Person class
        m.info();
        
        // From Employee class
        m.empDetails();
        
        // From Sports interface
        m.play();
        
        // From Hobbies interface
        m.hobby();
    }
}
