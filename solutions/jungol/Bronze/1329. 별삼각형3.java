import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num <= 100 && num % 2 == 1) {
            for (int i = 1; i <= num; i += 2) {
                for (int j = 1; j < i; j += 2)
                    System.out.print(" ");

                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = num - 2; i >= 1; i -= 2) {
                for (int j = 1; j < i; j += 2)
                    System.out.print(" ");

                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("INPUT ERROR!");
        }
    }
}