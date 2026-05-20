import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = n * n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = m - n * j - i;
                char alphabet = (char)('A' + (num % 26));

                System.out.print(alphabet + " ");
            }
            System.out.println();

        }
    }
}