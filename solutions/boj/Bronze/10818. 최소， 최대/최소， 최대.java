import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1000000;
        int min = 1000000;

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();

            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.printf("%d %d", min, max);
    }
}
