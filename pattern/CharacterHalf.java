package pattern;
public class CharacterHalf {
    public static void main(String[] args) {

        try {
            char ch = 'A';

            for (int i = 1; i <= 4; i++) { // i = 2
                for (int j = 1; j <= i; j++) { // j = 1 , 2
                    System.out.print(ch); // A
                    ch++; // B
                }
                // j++;
                System.out.println(); // A

            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
