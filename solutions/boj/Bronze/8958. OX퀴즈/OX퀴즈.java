import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int textCase = sc.nextInt();

        for (int i = 1; i <= textCase; i++) {
            String ox = sc.next();

            int score = 0;
            int count = 0;

            for (int j = 0; j < ox.length(); j++) {
                if (ox.charAt(j) == 'O') {
                    count++;
                    score += count;
                }
                else {
                    count = 0;
                }
            }
            System.out.println(score);
        }
    }
}

