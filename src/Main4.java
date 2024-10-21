import java.util.Scanner;
import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String st1 = scanner.nextLine().trim();
        String st2 = scanner.nextLine().trim();

        char[] mas1 = st1.toCharArray();
        char[] mas0 = st2.toCharArray();
        Arrays.sort(mas1);
        Arrays.sort(mas0);

        if (Arrays.equals(mas1, mas0)) /*метод экуалс это типо == за исключением того, что оператор == не позволяет сравнивать операнды неприводимых друг к другу типов.*/ {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}