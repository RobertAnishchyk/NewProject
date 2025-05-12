import java.util.Scanner;

public class Taske {
    public static void main (String[] args ) {
        Scanner tasktwo = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = tasktwo.nextInt();
        int Prime = 1;

        if (number < 2) {
            Prime = 0;
        }
        for (int i = 2; i < number && Prime == 1; i++) {
            if (number % i == 0) {
                Prime = 0;
            }
        }
        if (Prime == 1) {
            System.out.println(number + " простое число");
        } else {
            System.out.println(number + " не простое число");
        }



    }

    }





















