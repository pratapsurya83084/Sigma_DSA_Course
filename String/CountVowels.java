import java.util.*;

public class CountVowels {

    public static void main(String[] args) {
        System.out.print("enter string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.print("the vowels are occured in string are : " + count + " times ");
    }
}
