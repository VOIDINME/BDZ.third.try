import java.util.Scanner;
//https://javarush.com/groups/posts/1895-rekursija-v-java
//https://www.geeksforgeeks.org/recursion-in-java/ здесь про рекурсии читал
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        mass(n, 'A', 'C', 'B');
    }
    public static void mass(int n, char o, char zpp, char ppz) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + o + " to " + zpp);
        } else {
            mass(n - 1, o, ppz, zpp);
            System.out.println("Move disk " + n + " from " + o + " to " + zpp);
            mass(n - 1, ppz, zpp, o);
        }
    }
}