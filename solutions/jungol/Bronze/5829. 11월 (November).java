import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A + (7 * B) > 30) {
            System.out.println(0);
        }
        else {
            System.out.println(1);
        }
    }
}