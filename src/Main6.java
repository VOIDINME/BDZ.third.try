import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        while (n != 0) {
            int c = a & n;
            a = a ^ n;
            n = c << 1;
        }
        System.out.println(a);//самое легкое
    }
}