// // First Interface
// interface InterfaceA {
//     void methodA();
// }

// // Second Interface
// interface InterfaceB {
//     void methodB();
// }

// // Class implementing both interfaces
// class MyClass implements InterfaceA, InterfaceB {
//     public void methodA() {
//         System.out.println("Method from InterfaceA");
//     }

//     public void methodB() {
//         System.out.println("Method from InterfaceB");
//     }
// }

// // Main Class
// public class MultipleInheritanceExample {
//     public static void main(String[] args) {
//         MyClass obj = new MyClass();
//         obj.methodA();
//         obj.methodB();
//     }
// }











// Why use @Override?

// Compile-time checking:

// If you accidentally mismatch the method signature (e.g., wrong name, wrong parameters), the compiler will give an error.

// Without @Override, the compiler might think it’s a new method instead of overriding the interface method.

// Without @Override, Java thinks this is just a new method, and you won’t get an error, but methodA() from A remains unimplemented → may cause compilation error elsewhere.
// With @Override, the compiler immediately says:

// method does not override or implement a method from a supertype



// First interface
interface A {
    void methodA();
}

// Second interface
interface B {
    void methodB();
}

// Class implementing multiple interfaces
class C implements A, B {
    // @Override
    public void methodA() {
        System.out.println("Method A from interface A");
    }

    // @Override
    public void methodB() {
        System.out.println("Method B from interface B");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA(); // Calls method from interface A
        obj.methodB(); // Calls method from interface B
    }
}
