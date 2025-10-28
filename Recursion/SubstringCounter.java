public class SubstringCounter {

    public static int printSubstrings(String str, int start, int end) {
       
        if (start == str.length()) {
            return 0;
        }

        if (end > str.length()) {
            return printSubstrings(str, start + 1, start + 1);
        }
        System.out.println(str.substring(start, end));
        return 1 + printSubstrings(str, start, end + 1);
    
    }

    public static void main(String[] args) {
        String str = "abc";
        int count = printSubstrings(str, 0, 1);
        System.out.println("Total substrings: " + count);
    }
}
