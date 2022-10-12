public class NumberOf1Bits_191 {
    public static void main(String[] args) {
        NumberOf1Bits_191 numberOf1Bits_191 = new NumberOf1Bits_191();
        System.out.println(numberOf1Bits_191.hammingWeight(00000000000000000000000000001011));
    }
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;

    }
}
