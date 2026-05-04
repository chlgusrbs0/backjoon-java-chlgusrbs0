import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Arrays.stream(arr).max().getAsInt();

        for (int j = 0; j < 9; j++) {
            if (arr[j] == max) {
                System.out.println(max);
                System.out.println(j + 1);
            }
        }
    }
}