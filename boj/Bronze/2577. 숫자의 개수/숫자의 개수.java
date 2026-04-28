import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int resultNum = num1 * num2 * num3;

        int[] count = new int[10];

        String strNum = String.valueOf(resultNum);

        for (int j = 0; j < strNum.length(); j++) {
            char charNum = strNum.charAt(j);
            switch (charNum) {
                case '0' : count[0]++; break;
                case '1' : count[1]++; break;
                case '2' : count[2]++; break;
                case '3' : count[3]++; break;
                case '4' : count[4]++; break;
                case '5' : count[5]++; break;
                case '6' : count[6]++; break;
                case '7' : count[7]++; break;
                case '8' : count[8]++; break;
                case '9' : count[9]++;
            }
        }
        for (int k = 0; k <= 9; k++) {
            System.out.println(count[k]);
        }
    }
}
