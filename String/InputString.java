import java.util.Scanner;

public class InputString {

    public static void main(String[] args) {

        // System.out.println("enter your name : ");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);
        // stringbuilder

        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");

        System.out.println(sb);

        String s = "hello";
        String ss = s.concat(" pratap");
        System.out.println(ss);


        //  stringbuffer
        StringBuffer sbb = new StringBuffer("hey");
      sbb.append("hii");
        System.out.println(sbb);
    }

}
