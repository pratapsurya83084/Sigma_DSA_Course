// What are Getters and Setters in Java?
// Getter → A method that returns the value of a private variable.
// Setter → A method that sets/updates the value of a private variable.


class Student {
    // private fields
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age (with validation)
    public void setAge(int age) {
        if (age > 0) {   // validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class GatterAndSetters {

      public static void main(String[] args) {
        Student s = new Student();

        s.setName("Pratap");
        s.setAge(25);
        System.out.println(s.getName() + " - " + s.getAge());     
    }
}
