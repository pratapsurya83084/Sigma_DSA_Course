





abstract class S1 {
    abstract void sound();

    void eat() {
        System.out.println("this is a eating method.....");
    }
}

class Child extends S1 {
    // implement abstract method
    void sound() {
        System.out.println("this is a abstract method ....");
    }

}

public class AbsClassEx {
    public static void main(String[] args) {

        S1 obj = new Child();
        obj.eat();
        obj.sound();

    }
    
}
