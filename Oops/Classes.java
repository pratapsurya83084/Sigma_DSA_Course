
class Pen {
    int price;
    String pcolor;

    void pencolor(int penprices, String penColor) {
        price = penprices;
        pcolor = penColor;
    }

}

class Tree {
    int theight;
    String name;

    void trre(int height, String tname) {
        theight = height;
        name = tname;

    }

    
    void trre2(int height, String tname) {
        theight = height;
        name = tname;

    }

    
    void trre3(int height, String tname) {
        theight = height;
        name = tname;

    }

    
}

// main method
public class Classes {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.pencolor(12, "cello");

        Tree p2 = new Tree();
        p2.trre(20, "mango");

        System.out.println(p1.price + " " + p1.pcolor);
        System.out.println(p2.theight + " " + p2.name);

    }
}
