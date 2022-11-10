import java.util.Scanner;

public class Farzin {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("  x1 ning koordinatasini kiriting");
        x1 = scanner.nextInt();
        System.out.println("  y1 ning koordinatasini kiriting");
        y1 = scanner.nextInt();
        System.out.println("  x2 ning koordinatasini kiriting");
        x2 = scanner.nextInt();
        System.out.println("  y2 ning koordinatasini kiriting");
        y2 = scanner.nextInt();
        if (x1== x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            System.out.println("Farzin bu koordinatadagi donachani ura oladi");
        } else {
            System.out.println("Farzin bu  koordinatadagi  donachani ura olmaydi ");
        }


    }
}
