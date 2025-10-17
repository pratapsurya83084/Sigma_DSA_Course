
//  Abstraction using interface

interface Vehicle {
    void start();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is start using key");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is start using button");
    }
}

public class UsingIntrface {

    public static void main(String[] args) {
        Vehicle obj = new Bike();
        obj.start();

        Vehicle obj2 = new Car();
        obj2.start();
    }

    

}
