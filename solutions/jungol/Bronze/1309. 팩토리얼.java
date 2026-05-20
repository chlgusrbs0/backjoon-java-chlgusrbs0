import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long factorial = 1;

        for(int i = n; i >= 1; i--) {
            factorial *= i;
            if (i == 1) {
                System.out.printf("%d! = 1\n", i);
                break;
            }
            else {
                System.out.printf("%d! = %d * %d!\n", i, i, i - 1);
            }

        }
        System.out.print(factorial);
    }
}