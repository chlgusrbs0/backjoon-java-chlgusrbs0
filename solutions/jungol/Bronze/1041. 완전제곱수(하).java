import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean found = false;

        for (int i = 1; i <= 100; i++) {
            int square = i * i;

            if (square >= n && square <= m) {
                System.out.print(square + " ");
                found = true;
            }
        }
        if (found == false) {
            System.out.println(0);
        }
    }
}
