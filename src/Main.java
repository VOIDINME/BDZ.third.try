import java.util.Scanner;
public class Main {

    public static String szht(String input) {

        StringBuilder strbuld = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                strbuld.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        strbuld.append(input.charAt(input.length() - 1)).append(count);
        return strbuld.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String res = szht(input);
        System.out.println(res);
    }
}