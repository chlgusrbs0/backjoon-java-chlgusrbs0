import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int[] stack = new int[N];


        int top = -1;

        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();

            if (input.charAt(0) == 'i') {
                int num = Integer.parseInt(input.substring(2));

                stack[top + 1] = num;
                top++;
            }
            else if (input.equals("o")) {
                if (top == -1) {
                    System.out.println("empty");
                }
                else {
                    System.out.println(stack[top]);
                    top--;
                }

            }
            else if (input.equals("c")) { // 수 출력
                if (top == -1) {
                    System.out.println(0);
                }
                else {
                    System.out.println(top + 1);
                }
            }
        }
    }
}