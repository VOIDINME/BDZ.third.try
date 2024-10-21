import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversedNumber = reverseDigits(number);
        System.out.println(reversedNumber);
    }
    public static int reverseDigits(int i) {
        int reversedNumber = 0;
        while (i > 0) {
            int lastDigit = i % 10;
            // буду писать коменты типо крутой ну и чтобы вы поняли что не списываю короче
            //чтобы узнать число нам нужно последнее число делить на 10 и остаток это и есть число
            reversedNumber = reversedNumber * 10 + lastDigit;
            // Здесь удаляяем последнюю цифру
            i /= 10;
        }
        return reversedNumber;//возвращаем нужное нам значение
    }
}