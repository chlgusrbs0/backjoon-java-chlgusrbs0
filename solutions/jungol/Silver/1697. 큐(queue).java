import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int[] queue = new int[N];

        int front = 0;
        int rear = 0;

        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();

            if (input.charAt(0) == 'i') {
                int num = Integer.parseInt(input.substring(2));

                queue[rear] = num;
                rear++;
            }
            else if (input.charAt(0) == 'c') {
                System.out.println(rear - front);
            }
            else if (input.charAt(0) == 'o') {
                if (front != rear) {
                    System.out.println(queue[front]);
                    front++;
                }
                else {
                    System.out.println("empty");
                }
            }
        }
    }
}