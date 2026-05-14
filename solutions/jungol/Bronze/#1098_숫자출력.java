import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        int[] match = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        String n = sc.next();

        for (int i = 0; i < n.length(); i++) {
            count += match[(n.charAt(i) - '0')];

        }
        System.out.println(count);
    }
}
