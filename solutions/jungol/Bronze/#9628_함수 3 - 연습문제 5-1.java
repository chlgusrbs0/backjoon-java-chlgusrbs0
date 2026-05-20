import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Fib(7));
    }

    static int Fib(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return Fib(num - 1) + Fib(num - 2);
    }
}
