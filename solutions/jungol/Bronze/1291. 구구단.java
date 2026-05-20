import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int s = sc.nextInt();
            int e = sc.nextInt();

            if ((s >= 2 && s <= 9) && (e >= 2 && e <= 9)) {
                if (e >= s) {
                    for (int i = 1; i <= 9; i++) {
                        for (int j = s; j <= e; j++) {
                            System.out.printf("%d * %d =%3d   ", j, i, j * i);
                        }
                        System.out.println();
                    }
                }
                if (s > e) {
                    for (int i = 1; i <= 9; i++) {
                        for (int j = s; j >= e; j--) {
                            System.out.printf("%d * %d =%3d   ", j, i, j * i);
                        }
                        System.out.println();
                    }
                }
            }
            else {
                System.out.println("INPUT ERROR!");
            }
        } while (sc.hasNextInt());
    }
}