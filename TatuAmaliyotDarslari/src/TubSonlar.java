
import java.util.Scanner;

public class TubSonlar {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        boolean tub;
        for (int i = 2; i <= a; i++) {
            tub = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    tub = false;
                    break;
                }
            }
            if (tub) System.out.print(i + " ");
        }

    }
}
