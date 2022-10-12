import java.util.Scanner;
public class AverageSalaryExcludingtheMinimumandMaximumSalary_1491 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] salary = new int[n];
        for (int i = 0; i < n; i++) {
            salary[i] = scanner.nextInt();
        }
        System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            }
            if (salary[i] > max) {
                max = salary[i];
            }
            sum += salary[i];
        }
        return (double) (sum - min - max) / (salary.length - 2);

    }
}

