public class SubstracTheProductAndSumOfDigitsOfAnInteger_1281 {
    public static void main(String[] args) {
        SubstracTheProductAndSumOfDigitsOfAnInteger_1281 subtract = new SubstracTheProductAndSumOfDigitsOfAnInteger_1281();
        System.out.println(subtract.subtractProductAndSum(234));
    }
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return product - sum;
    }
}
