import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (hour == 0 && minute < 45) {
            hour += 24;
        }

        int totalMinutes = ((hour * 60 + minute) - 45);
        int resultHour = totalMinutes / 60;
        int resultMinute = totalMinutes % 60;

        System.out.printf("%d %d", resultHour, resultMinute);






    }
}
