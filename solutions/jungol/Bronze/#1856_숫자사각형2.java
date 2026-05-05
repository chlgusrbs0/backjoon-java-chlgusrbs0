import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = count + 1; j <= m * i; j++) {
                    System.out.print(j + " ");
                }
                count += m;
                System.out.println();

            }
            else {
                for (int k = count + m; k >= count + 1; k--) {
                    System.out.print(k + " ");
                }
                count += m;
                System.out.println();
            }
        }
    }
}