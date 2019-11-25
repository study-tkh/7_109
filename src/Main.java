import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        long x = enteringNumber();
        System.out.println("Введите второе число");
        long y = enteringNumber();
        System.out.println("НОД: " + nod(x, y));
    }

    private static long nod(long x, long y) {
        return y == 0 ? x : nod(y, x % y);
    }

    private static int enteringNumber() {
        int number = 0;
        try {
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Ошибка. Введено отрицательное значение");
                System.exit(0);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка. Введено недопустимое значение");
            System.exit(0);
        }
        return number;
    }
}