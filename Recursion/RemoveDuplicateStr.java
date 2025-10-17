

public class RemoveDuplicateStr {

    public static void DuplicateCharRemove(String str, int i, StringBuilder newStr, boolean map[]) {

        // base case: if we reached the end of the string
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);

        if (map[currChar - 'a'] == true) {
          
            DuplicateCharRemove(str, i + 1, newStr, map);
        } else {
            
            map[currChar - 'a'] = true;
            DuplicateCharRemove(str, i + 1, newStr.append(currChar), map);
        }
        
    }

    public static void main(String[] args) {

        String str = "apanacollege";

        DuplicateCharRemove(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
