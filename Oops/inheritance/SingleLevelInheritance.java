
class Animal {
    int age = 21;

    void eat() {
        System.out.println("animal is eating food....");
    }

    void drink() {
        System.out.println("Animal is drinking water....");
    }
}

class Lion extends Animal {

    void tiger() {
        System.out.println("tiger is eating chicken.....");
    }

}

class SingleLevelInheritance {
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.eat(); // base (parent class) property run
        l1.drink(); // base (parent class) property run
        l1.tiger(); // child (sub class) property run
        System.out.println(l1.age);

    }
}