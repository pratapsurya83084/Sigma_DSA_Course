// interface A {
//     void show();
// }

// interface B {
//     void show();
// }

// class C implements A, B {
//     // ❌ If we don't override show(), Java gets confused:
//     // Ambiguity Error: which show() should be used? (A or B)
    
//     // ✅ To fix, we MUST override show()
//     public void show() {
//         System.out.println("C's own show() implementation");
//     }
// }

class A{
    void show(){
        System.out.println("A class show method");
    }
}

class B extends A{
void show(){
    System.out.println("B class show method");
}
}


class C extends A,B {
    void show(){
        System.out.println("C class show method");
    }
}

public class AmbiguityErrorExample {
    public static void main(String[] args) {
        C obj = new C();
        obj.show(); // Calls C's version (ambiguity resolved)
    }
}
