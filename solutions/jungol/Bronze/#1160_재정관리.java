import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float sum = 0;

        for (int i = 1; i <= 12; i++) {
            float num = sc.nextFloat();
            sum += num;
        }
        System.out.printf("%.2f", sum / 12);
    }
}