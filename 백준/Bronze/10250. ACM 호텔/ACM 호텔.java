import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int H = sc.nextInt();
            sc.nextInt();
            int N = sc.nextInt();

            int floorNumber = N % H;
            int roomNumber = N / H + 1;

            if (floorNumber == 0) {
                 floorNumber = H;
                 roomNumber--;
            }

            System.out.printf("%d%02d\n", floorNumber, roomNumber);
        }
    }
}
