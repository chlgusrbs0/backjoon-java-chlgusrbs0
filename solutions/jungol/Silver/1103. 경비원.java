import java.util.Scanner;

public class Main {
    static int x, y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        int N = sc.nextInt();

        int sum = 0;

        int[] stores = new int[N];

        for (int i = 0; i < N; i++) {
            int storeDirection = sc.nextInt();
            int storeLocation = sc.nextInt();

            int storeDistance = SearchDistance(storeDirection, storeLocation);

            stores[i] = storeDistance;
        }

        int direction = sc.nextInt();
        int location = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int distance = SearchDistance(direction, location);

            int diff = Math.abs(distance - stores[i]);

            sum += Math.min(diff, x * 2 + y * 2 - diff);
        }

        System.out.println(sum);
    }

    public static int SearchDistance(int direction, int location) {
        switch (direction) {
            case 1: // 북
                return location;
            case 2: // 남
                return x * 2 + y - location;
            case 3: // 서
                return x * 2 + y * 2 - location;
            case 4: // 동
                return x + location;
        }

        return - 1;
    }
}