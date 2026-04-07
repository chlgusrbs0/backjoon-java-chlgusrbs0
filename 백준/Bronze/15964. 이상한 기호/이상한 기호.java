import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(function(A ,B));
    }
    public static long function(int A, int B) {
        return (A + B) * (A - B);

    }
}
