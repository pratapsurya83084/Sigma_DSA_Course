import java.sql.Struct;

class Student {

    String name;
    int rollno;
    int age;

    // in one class multiple constructor can write
    // if not passed parameter then default constructor is print
    // non -partameterized( Default Constructor ) constructor
    Student() {
        System.out.println("this is a default non-parameterized constructor......");
    }

    // parameterized constructor
    Student(String name) {
        this.name = name;
        // this.rollno = rollno;
    }

    Student(int rollno) {
        this.rollno = rollno;
    }

    // Parameterized Constructor - s1
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor - s2
    Student(Student a) {
        name = a.name;
        age = a.age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }

}

public class EncapsulaTions {

    public static void main(String[] args) {

        // create object of student and pass constructor value
        // Student s1 = new Student();

        // Student s2 = new Student("pratap");

        // copy constructor

        Student s1 = new Student("Pratap", 22);
        Student s2 = new Student(s1); // calls copy constructor

        s1.display(); // Output: Pratap - 22
        s2.display(); // Output: Pratap - 22

        Student s3 = new Student(77);
        System.out.println("rollNumber is : " + s3.rollno);
    }

}







// class BankAccount {
//     private double balance;

//     // deposit money
//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//         } else {
//             System.out.println("Invalid deposit amount!");
//         }
//     }

//     // withdraw money
//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//         } else {
//             System.out.println("Invalid or insufficient balance!");
//         }
//     }

//     // getter for balance
//     public double getBalance() {
//         return balance;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount();
//         account.deposit(5000); // valid
//         account.withdraw(2000); // valid
//         account.withdraw(4000); // invalid

//         System.out.println("Current Balance: " + account.getBalance());
//     }
// }








// class ATM {
//     private int pin = 1234;
//     private double balance = 10000;

//     // validate pin
//     private boolean validatePin(int enteredPin) {
//         return enteredPin == pin;
//     }

//     public void withdraw(int enteredPin, double amount) {
//         if (validatePin(enteredPin)) {
//             if (amount <= balance) {
//                 balance -= amount;
//                 System.out.println("Withdraw Successful! New Balance: " + balance);
//             } else {
//                 System.out.println("Insufficient balance!");
//             }
//         } else {
//             System.out.println("Invalid PIN!");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         ATM atm = new ATM();
//         atm.withdraw(1234, 2000); // valid
//         atm.withdraw(9999, 1000); // invalid pin
//     }
// }
