import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("элементов");
        int st = scanner.nextInt();
        int[] mas = new int[st];

        System.out.println("элементы:");
        for (int i = 0; i < st; i++) {
            mas[i] = scanner.nextInt();
        }
        Arrays.sort(mas);
        mas = Arrays.stream(mas)
                .distinct().toArray();
        //здесь я прочитла про этот метод https://www.techiedelight.com/ru/remove-duplicates-from-array-java/
        System.out.println(Arrays.toString(mas));
    }
}