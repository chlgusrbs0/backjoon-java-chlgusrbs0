import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num == 1) {
            for (int i = 2; i <= 8; i++) {
                num = sc.nextInt();
                if (num != i) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
            return;

        }
        if (num == 8) {
            for (int i = 7; i >= 1; i--) {
                num = sc.nextInt();
                if (num != i) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }
    }
}
