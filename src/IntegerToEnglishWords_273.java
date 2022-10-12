public class IntegerToEnglishWords_273 {
    public static void main(String[] args) {
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(12345));
        System.out.println(numberToWords(1234567));
        System.out.println(numberToWords(1234567891));
    }
    public static String numberToWords(int num) {
        if (num == 0) return "Zero";
        int i = 0;
        String words = "";
        while (num > 0) {
            if (num % 1000 != 0)
                words = helper(num % 1000) + thousands[i] + " " + words;
            num /= 1000;
            i++;
        }
        return words.trim();
    }
    private static String[] belowTen = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static String[] belowTwenty = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static String[] belowHundred = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static String[] thousands = {"", "Thousand", "Million", "Billion"};
    private static String helper(int num) {
        if (num == 0)
            return "";
        else if (num < 10)
            return belowTen[num] + " ";
        else if (num < 20)
            return belowTwenty[num - 10] + " ";
        else if (num < 100)
            return belowHundred[num / 10] + " " + helper(num % 10);
        else
            return belowTen[num / 100] + " Hundred " + helper(num % 100);
    }
}
