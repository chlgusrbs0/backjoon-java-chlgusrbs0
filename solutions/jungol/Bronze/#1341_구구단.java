import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int s = sc.nextInt();
            int e = sc.nextInt();

            if ((s >= 2 && s <= 9) && (e >= 2 && e <= 9)) {
                if (e >= s) {
                    for (int i = s; i <= e; i++) {
                        for (int j = 1; j <= 9; j++) {
                            System.out.printf("%d * %d =%3d   ", i, j, j * i);

                            if (j % 3 == 0) {
                                System.out.println();
                            }
                        }
                        System.out.println();
                    }
                }
                if (s > e) {
                    for (int i = s; i >= e; i--) {
                        for (int j = 1; j <= 9; j++) {
                            System.out.printf("%d * %d =%3d   ", i, j, j * i);

                            if (j % 3 == 0) {
                                System.out.println();
                            }
                        }
                        System.out.println();
                    }
                }
            }
        } while (sc.hasNextInt());
    }
}