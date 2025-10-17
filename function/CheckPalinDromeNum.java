
public class CheckPalinDromeNum {

    public static void ISpalindrome(int num) {

        int revNum = 0;
        int original = num;



        while (num > 0) {
            int lastDigit = num % 10; // get 1
            revNum = revNum * 10 + lastDigit;
            num = num / 10;
        }

        if (original == revNum) {
            System.out.println(original   + " yes number is palindrome");
        } else {
            System.out.println(original   + " number is not palindrome");
        }
    }

    public static void main(String[] args) {
        int num = 10081;
        ISpalindrome(num);

        // System.out.println("palindrome:"+result);
    }

}
