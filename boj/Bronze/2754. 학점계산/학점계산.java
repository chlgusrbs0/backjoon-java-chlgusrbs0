import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String grade = sc.nextLine();
        if (grade.charAt(0) == 'F') {
            System.out.println(0.0);
            return;
        }

        float result = 0.0f;

        switch (grade.charAt(0)) {
            case 'A' : result = 4.0f; break;
            case 'B' : result = 3.0f; break;
            case 'C' : result = 2.0f; break;
            case 'D' : result = 1.0f; break;
        }
        switch (grade.charAt(1)) {
            case '+' : System.out.println(result += 0.3f); break;
            case '0' : System.out.println(result); break;
            case '-' : System.out.println(result -= 0.3f); break;
        }
    }
}
