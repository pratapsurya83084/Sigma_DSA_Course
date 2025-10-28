public class NumtoString {

    public static void numtostrWord(int si, int n, String str) {

        if (si > n) {
            return;
        }

        int digit = str.charAt(si) - '0'; // convert character to digit
        String word = "";

        switch (digit) {
            case 0: word = "zero"; break;
            case 1: word = "one"; break;
            case 2: word = "two"; break;
            case 3: word = "three"; break;
            case 4: word = "four"; break;
            case 5: word = "five"; break;
            case 6: word = "six"; break;
            case 7: word = "seven"; break;
            case 8: word = "eight"; break;
            case 9: word = "nine"; break;
        }

        System.out.print(word + " "); // print before recursion for correct order
        numtostrWord(si + 1, n, str);
    }

    public static void main(String[] args) {
        int n = 0;
        String str = String.valueOf(n);
        numtostrWord(0, str.length() - 1, str);
    }
}
