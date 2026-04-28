import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n <= 100 && (m >= 1 && m <= 3)) {
            if (m == 1) {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            if (m == 2) {
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            if (m == 3) {
                for (int i = 1; i <= n; i++) {
                    for (int k = n - i; k >= 1; k--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
        else {
            System.out.println("INPUT ERROR!");
        }
    }
}