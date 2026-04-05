import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        String str = sc.nextLine();
        int strLength = str.length();

        for (int i = 0; i < strLength; i++) {
            char strChar = str.charAt(i);

            if (Character.isLowerCase(strChar)) {
                result.append(Character.toUpperCase(strChar));
            }
            else {
                result.append(Character.toLowerCase(strChar));
            }
        }
        System.out.println(result.toString());
    }
}
