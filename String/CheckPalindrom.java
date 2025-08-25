
public class CheckPalindrom {

    public static boolean isplaindrome(String str) {
//    String strr = "hr jnej prataos suryayayyaya";
// String[] words = strr.split(" ");  // split on space

// System.out.println(words);
// String st = "";
// for (int w=0; w<words.length; w++) {
//     // System.out.print("splitted string :  "+words[w] + " ");
//     if(words[w].length() > st.length() ){
// st = words[w];
//     }
// }
// System.out.println("longest string : " + st );


        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) { // i = 1 , 6-1-1 = 4
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "level";

        boolean re = isplaindrome(str);
        System.out.println(re);

    }

}
