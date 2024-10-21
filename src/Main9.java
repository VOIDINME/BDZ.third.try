import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] num = Long.toString(scanner.nextLong()).toCharArray();

        boolean[] a = new boolean[num.length];
        res(num, a, new StringBuilder());
    }
    private static void res(char[] num, boolean[] a, StringBuilder strb) {
        //стринг булдер очень полезный
        if (strb.length() == num.length) {
            System.out.println(strb);
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (!a[i]) {
                a[i] = true;
                strb.append(num[i]);
                res(num, a, strb);
                strb.deleteCharAt(strb.length() - 1);
                a[i] = false;
            }
        }
    }
}