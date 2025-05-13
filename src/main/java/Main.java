import java.util.Scanner;

/*
Задание1
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int orig = number;
        int polindrom = 0;

        while (number > 0) {
            polindrom = polindrom * 10 + number % 10;
            number /= 10;
        }
        if (orig == polindrom) {
            System.out.println("Полиндром");
        }
        else {
            System.out.println("Не Полиндром");

        }

    }
}