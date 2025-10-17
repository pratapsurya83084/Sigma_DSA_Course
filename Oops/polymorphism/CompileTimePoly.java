
class Calculator {
    // Method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 2 double parameters
    double add(double a, double b) {
        return a + b;
    }

    // Method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePoly {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));        // Calls add(int, int)
        System.out.println(c.add(5.5, 4.5));      // Calls add(double, double)
        System.out.println(c.add(1, 2, 3));       // Calls add(int, int, int)
    }
}
