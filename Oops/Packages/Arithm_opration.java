
import oprations.OprationArith;

public class Arithm_opration {
    public static void main(String[] args) {

        OprationArith op = new OprationArith();

        int sum = op.add(2, 3);
        int subs = op.sub(3, 2);
        int multi = op.mul(2, 5);
        int divi = op.div(14, 2);
        int modu = op.modulo(15, 5);


        System.out.println("sum is :" + sum);
        System.out.println("subs is :" + subs);
        System.out.println("mult is :" + multi);
        System.out.println("div is :" + divi);
        System.out.println("modulo is :" + modu);

    }
}
