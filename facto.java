import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for find factorial :");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("factorial cannot found ");
            return;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("factorial is : " + fact);

    }
}
