import java.util.Scanner;

public class AverageSalaryExcludingtheMinimumandMaximumSalary_1491 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] salary = new int[n];
        System.out.println(average(salary));

    }

    public static double average(int[] salary) {
        Scanner sc = new Scanner(System.in);
        int max = salary[0];
        int min = salary[0];
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            salary[i] = sc.nextInt();
        }
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max) {
                max = salary[i];
            }
            if (salary[i] < min) {
                min = salary[i];
            }

        }
            sum = (max + min)/2;
        return sum ;

    }


}
