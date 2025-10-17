

interface Animal {
    void Horse();
}

class A implements Animal {
    public void Horse() {
        System.out.println("this is A class....");
    }
}

class B implements Animal {
    public void Horse() {
        System.out.println("this is B class....");
    }
}


public class UsingInterface {

    public static void main(String[] args) {

        Animal a = new A();
        a.Horse();

        Animal b = new B();
        b.Horse();

    }
}
