import java.util.Scanner;

public class LessThree_taskThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите высоту лесенки: ");
        int h = s.nextInt();

        while (h > 0) {
            int c = h;
            while (c-- > 0) {
                System.out.print("#");
            }
            System.out.println();
            h--;
        }
    }
}