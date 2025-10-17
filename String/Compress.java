
public class Compress {
    public static void main(String[] args) {

        String str = "aabbbc"; // 4 - 1 = 3
        String newStr = "";

        for (int i = 0; i < str.length(); i++) { // i = 0 1 2 3
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        System.out.println(newStr);
    }
}
