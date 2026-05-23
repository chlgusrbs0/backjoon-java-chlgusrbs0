import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int sum1 = (num1 + num2) * 2;
        int sum2 = (num3 + num4) * 2;

        int x = sum1;
        int y = sum2;

        while (y!= 0) {
            int r = x % y;
            x = y;
            y = r;

        }
        int gcd = x;
        int lcm = (sum1 * sum2) / gcd;

        int result = sum1 * 10 / lcm;
        System.out.println(result);

    }
}