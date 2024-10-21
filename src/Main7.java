import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] bred = new int[n][n];
        zapolTriangle(scan, bred, n);

        int maxSum = calculateMaxSum(bred, n);
        System.out.println(maxSum);
    }
    private static void zapolTriangle(Scanner sc, int[][] bred, int n) {
        for (int i = 0; i < n; i++) {/*сам еле понял это задание попрочил помощи у товарища*/
            for (int j = 0; j <= i; j++) {
                bred[i][j] = sc.nextInt();
            }
        }
    }
    private static int calculateMaxSum(int[][] bred, int n) {
        // Обратный обход для нахождения максимального пути
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                bred[i][j] += Math.max(bred[i + 1][j], bred[i + 1][j + 1]);
            }
        }
        return bred[0][0];
    }
}