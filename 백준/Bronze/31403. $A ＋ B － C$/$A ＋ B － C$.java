import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        String numStr1 = String.valueOf(num1);
        String numStr2 = String.valueOf(num2);

        String numResult = numStr1 + numStr2;
        int result = Integer.parseInt(numResult) - num3;

        System.out.printf("%d\n", num1 + num2 - num3);
        System.out.println(result);
    }
}
