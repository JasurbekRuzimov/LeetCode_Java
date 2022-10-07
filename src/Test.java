public class Test {
    public static void main(String[] args) {
        average(new int[]{4000,3000,1000,2000});

    }
public static double average(int[] salary) {
    int max = salary[0];
    int min = salary[0];
    int sum = 0;
    for (int i = 0; i < salary.length; i++) {
        if (salary[i] > max) {
            max = salary[i];
        }
        if (salary[i] < min) {
            min = salary[i];
        }
    }
    for (int i = 0; i < salary.length; i++) {
        sum += salary[i];
    }
    return (sum - max - min) / (salary.length - 2);
}
}