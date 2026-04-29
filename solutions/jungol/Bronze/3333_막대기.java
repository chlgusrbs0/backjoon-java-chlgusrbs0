import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        int h = 0;

        int[] num = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            num[i] = sc.nextInt();
        }
        for (int j = 0; j < N; j++) {
            if (num[j] > h) {
                h = num[j];
                count++;
            }
        }
        System.out.println(count);
    }
}