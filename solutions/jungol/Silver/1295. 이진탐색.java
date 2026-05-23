import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int num = sc.nextInt();

            int left = 0;
            int mid = (arr.length - 1) / 2;
            int right = arr.length - 1;

            while (left <= right) {
                mid = (left + right) / 2;

                if (arr[mid] < num) {
                    left = mid + 1;
                }
                else if (arr[mid] > num) {
                    right = mid - 1;
                }
                else {
                    System.out.println(mid + 1);
                    break;
                }
            }
            if (left > right) {
                System.out.println(0);
            }
        }
    }
}