class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class  RunTimePoly{
    public static void main(String[] args) {
        Animal a;       // Parent reference

        a = new Dog();  // ✅ Upcasting
        a.sound();      // Output: Dog barks

        a = new Cat();  // ✅ Upcasting
        a.sound();      // Output: Cat meows
    }
}
