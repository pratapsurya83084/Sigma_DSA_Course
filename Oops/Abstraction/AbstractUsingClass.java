
abstract class AbsClass {

    abstract void sound();

    void eating() {
        System.out.println("eating....");
    }
}

class Child extends AbsClass {
    void sound() {
   System.out.println("this is a abstracted method...");
    }
}

public class AbstractUsingClass {
    public static void main(String[] args) {

     AbsClass obj1 = new Child(); //ypcasting 

     obj1.eating();  // 
     obj1.sound();   //


    }
}
