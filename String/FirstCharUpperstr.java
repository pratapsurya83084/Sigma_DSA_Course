
public class FirstCharUpperstr {

    public static void main(String[] args) {
        String str = "hey i am pratap";

        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(str.charAt(0))); // 0th index of string uppercase even it word or not

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i); // single char
            if (ch == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // add original space and
                i++; // next index after space
                sb.append(Character.toUpperCase(str.charAt(i))); // make it upperCase that index

            } else {
                sb.append(str.charAt(i)); // if space not exists in string then add as it is string
            }
        }
        System.out.print(sb.toString()); // print neew string
    }

}
