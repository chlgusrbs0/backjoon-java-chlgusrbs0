import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 97 + i && (alphabet[i] == - 1 || alphabet[i] > j)) {
                    alphabet[i] += j + 1;
                }
            }
            System.out.print(alphabet[i] + " ");
        }
    }
}
