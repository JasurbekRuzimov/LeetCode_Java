import java.util.Scanner;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        isPalindrome(n);
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int a = x;
        int b = 0;
        while (x > 0) {
            b = b * 10 + x % 10;
            x = x / 10;
        }
        return a == b;
    }
}
