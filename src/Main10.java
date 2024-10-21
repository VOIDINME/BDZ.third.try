import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String base = scanner.nextLine();
        String text = scanner.nextLine();

        res(base, text);
    }
    public static void res(String base, String text) {
        boolean bol = false;
        for (int i = 0; i <= base.length() - text.length(); i++) {
            if (base.substring(i, i + text.length()).equals(text)) {/*https://proglang.su/java/strings-substring*/
                System.out.print(i + " ");
                bol = true;
            }
        }
        if (!bol) {
            System.out.println("-1");
        }
    }
}