import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        int y, m, d;

        boolean leap = false;

        while (true) {

            y = sc.nextInt();
            m = sc.nextInt();
            d = sc.nextInt();

            if ((y < 2000 || y > 2010) || (m < 1 || m > 12)) {
                System.out.println("INPUT ERROR!");
            }
            else {
                leap = (y % 400 == 0) || ((y % 4 == 0) && !(y % 100 == 0));

                int limit = maxDays[m - 1];

                if (leap && m == 2) {
                    limit = 29;
                }

                if (d < 1 || d > limit) {
                    System.out.println("INPUT ERROR!");
                } else {
                    break;
                }
            }
        }

        int sum = 0;
        int base = 6;

        for (int i = 2000; i < y; i++) {
            boolean yearLeap = (i % 400 == 0) || ((i % 4 == 0) && !(i % 100 == 0));

            if (yearLeap) {
                sum += 366;
            }
            else {
                sum += 365;
            }
        }
        for (int i = 1; i <= m - 1; i++) {
            if (leap && i == 2) {
                sum++;
            }
            sum += maxDays[(i - 1)];
        }

        int first = ((base + sum) % 7);

        int date = 1;
        boolean firstWeek = true;

        System.out.printf("%d. %d\n", y, m);
        System.out.println("sun mon tue wed thu fri sat");

        while (true) {
            for (int j = 0; j < 7; j++) {
                if ((j < first) && firstWeek) {
                    System.out.print("    ");
                }
                else {
                    System.out.printf("%3d ", date);
                    date++;
                }

                int targetDay = (first + d - 1) % 7;

                if (leap && m == 2) {
                    if (date > maxDays[m - 1] + 1) {
                        System.out.printf("\n%s", day[targetDay]);
                        return;
                    }
                }
                else {
                    if (date > maxDays[m - 1]) {
                        System.out.printf("\n%s", day[targetDay]);
                        return;
                    }
                }
            }
            firstWeek = false;
            System.out.println();
        }
    }
}