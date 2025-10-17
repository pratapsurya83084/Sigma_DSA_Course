
class GrandParent {

    void show() {
        System.out.println("GrandParent class method1.....");
    }

    void display() {
        System.out.println("GrandParent class method2 display");
    }
}

class Father extends GrandParent {

    void show2() {
        System.out.println("Father class method1.....");
    }

    void display2() {
        System.out.println("Father class method2 display");
    }
}

class Son extends Father {

    void shows() {
        System.out.println("Son class method1.....");
    }

    void displays() {
        System.out.println("Son class method2 display");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Son s = new Son();
        s.show();
        s.display();
        s.show2();
        s.display2();
        s.shows();
        s.displays();

    }
}
