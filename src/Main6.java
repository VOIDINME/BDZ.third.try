import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (b != 0) {
            int c = a & b;
            a = a ^ b;
            b = c << 1;
        }
        System.out.println(a);//самое легкое
    }
}