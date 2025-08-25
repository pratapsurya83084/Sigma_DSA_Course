import java.io.StringWriter;

public class FirstCharUpperstr {

    public static void main(String [] args){
        String str = "hey i am pratap";

    StringBuilder sb = new StringBuilder("");

      sb.append(Character.toUpperCase(str.charAt(0)) );



        for (int i = 1; i < str.length(); i++) {
             Character ch = str.charAt(i);  // single char
            if (ch==' ' && i < str.length()-1) {
                sb.append(str.charAt(i));
                i++;
          sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.print(sb.toString());
    }
}
