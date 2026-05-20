import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();

            System.out.println(num % 42);
        }
    }
}
