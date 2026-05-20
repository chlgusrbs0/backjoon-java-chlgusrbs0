import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String RRN = sc.next();
        int max = 0;
        int result = 0;

        for (int i = 0; i < RRN.length(); i++) {
            int digit = RRN.charAt(i) - '0';

            if (max < digit) {
                max = digit;
            }
        }

        for (int j = 0; j < RRN.length(); j++) {
            int num = 1;

            for (int k = RRN.length() - 1 - j; k >= 1; k--) {
                num *= max + 1;
            }
            result += (RRN.charAt(j) - '0') * num;
        }
        System.out.println(result);
    }
}