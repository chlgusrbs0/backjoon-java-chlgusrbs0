import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        boolean[] arr = new boolean[42];

        for (int i = 1; i <= 10; i++) {
            int resultNum = sc.nextInt() % 42;
             arr[resultNum] = true;
        }
        for (int j = 0; j < 42; j++) {
            if (arr[j]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
