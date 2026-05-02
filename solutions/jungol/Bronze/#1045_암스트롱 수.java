import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        boolean found = false;

        for (int i = 10; i <= N; i++) {
            if (i > 999) {
                break;
            }

            int sum = 0;
            String strNum = "" + i;

            for (int j = 0; j < strNum.length(); j++) {
                int num = Character.getNumericValue(strNum.charAt(j));
                int sumNum = 1;

                for (int k = 1; k <= strNum.length(); k++) {
                    sumNum *= num;
                }
                sum += sumNum;
            }

            if (i == sum) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println(0);
        }
    }
}