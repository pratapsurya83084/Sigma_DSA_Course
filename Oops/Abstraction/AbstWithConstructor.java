
abstract class Animal {
    // constractor inside abtract class
    Animal() {
        System.out.println("Animal constructor is called....");
    }

    String color;

    abstract void eat();
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor is called....");
    }

    void changeColor() {
        color = "dark brown";
    }

    void eat() {
        System.out.println("Animal is eating food....");
    }
}

class Chicken extends Animal {

    Chicken() {
        System.out.println("Chicken constructor is called....");
    }

    void changeColor() {
        color = "yellow";
    }

    void eat() {
        System.out.println("Animal eat chicken....");
    }
}

class Last extends Chicken {
    Last() {
        System.out.println("Last  constructor  is called...");
    }
}

public class AbstWithConstructor {
    public static void main(String[] args) {
        // Animal a = new Horse();
        // a.eat();
        // System.out.print(a.color); // always call superclass (parent ) class
        // constructor

        Last ch = new Last();

    }
}

// abstract class Animal {
// Animal() {
// System.out.println("ANIMAL CONSTRUCTOR IS CALLED.....");
// }
// }

// class C1 extends Animal {
// C1() {
// System.out.println("C1 Constructor is called.....");
// }
// }

// class C2 extends C1 {
// C2() {
// System.out.println("C2 CONSTRUCTOR IS CALLED.....");
// }
// }

// public class AbstWithConstructor {
// public static void main(String[] args) {

// C2 obj = new C2(); // call all constructor because of hierarchy extends

// }

// }

// output = ANIMAL CONSTRUCTOR IS CALLED.....
// C1 Constructor is called.....
// C2 CONSTRUCTOR IS CALLED.....
