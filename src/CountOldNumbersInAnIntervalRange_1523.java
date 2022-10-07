import java.util.Scanner;

public class CountOldNumbersInAnIntervalRange_1523 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int low = input.nextInt();
        int high = input.nextInt();
        System.out.println(countOdds(low, high));
    }

    public static int countOdds(int low, int high) {
        int cnt = 0;
        for (int i = low; i <= high; i++) {
            if (i % 2 != 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
