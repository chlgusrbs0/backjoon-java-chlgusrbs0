import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int index = 0;

        for (int i = 1; i <= 9; i++) {
            int inputNum = sc.nextInt();

            if(max < inputNum) {
                max = inputNum;
                index = i;
            }
            else {
                continue;
            }

        }

        System.out.println(max);
        System.out.println(index);
    }
}
