import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int max = 0;

        int row = 0;
        int column = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                num = sc.nextInt();

                if (max < num) {
                    max = num;
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", row, column);
    }
}