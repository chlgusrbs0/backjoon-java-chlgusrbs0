import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger int1 = new BigInteger(sc.next());
        String operator = sc.next();
        BigInteger int2 = new BigInteger(sc.next());

        if (operator.equals("+")) {
            System.out.println(int1.add(int2));
        }
        else {
            System.out.println(int1.multiply(int2));
        }
    }
}