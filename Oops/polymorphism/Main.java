class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // @Override
    void sound() { // ❌ Typo: should be "sound", but written "soud"
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a = new Dog();

        a.sound(); // ?
        a.sound();
    }
}
