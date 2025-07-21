package pattern;

public class RightArmss {

    public static void main(String[] args) {

        int n = 4;
        for (int i = 1; i < n; i++) {
            // 1 st row
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

        }

    }

}
