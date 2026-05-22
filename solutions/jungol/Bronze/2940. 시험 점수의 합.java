import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;
        int min = 100;
        int max = 0;

        for (int i = 1; i <= 4; i++) {
            num = sc.nextInt();
            sum += num;

            if (min > num) {
                min = num;
            }
        }
        for (int i = 1; i <= 2; i++) {
            num = sc.nextInt();

            if (max < num) {
                max = num;
            }
        }
        System.out.println((sum - min) + max);
    }
}