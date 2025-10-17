// Parent Class
class Animal {
    String type = "Animal";

    void eat() {
        System.out.println(type + " eats food.");
    }
}

// Child Class 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks...");
    }
}

// Child Class 2
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows...");
    }
}

// Child Class 3
class Bird extends Animal {
    void sound() {
        System.out.println("Bird chirps...");
    }
}

// Main Class
public class HierarchicalExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();      // from Animal
        d.sound();    // from Dog

        Cat c = new Cat();
        c.eat();      // from Animal
        c.sound();    // from Cat

        Bird b = new Bird();
        b.eat();      // from Animal
        b.sound();    // from Bird
    }
}
