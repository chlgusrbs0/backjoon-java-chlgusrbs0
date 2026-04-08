import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        System.out.println(function(num1, num2, num3, num4, num5));
    }
    public static int function(int num1, int num2, int num3, int num4, int num5) {
        num1 *= num1;
        num2 *= num2;
        num3 *= num3;
        num4 *= num4;
        num5 *= num5;
        return (num1 + num2 + num3 + num4 + num5) % 10;
    }
}