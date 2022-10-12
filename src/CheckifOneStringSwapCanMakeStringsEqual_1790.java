public class CheckifOneStringSwapCanMakeStringsEqual_1790 {
    public static void main(String[] args) {

    }
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        int n = s1.length();
        int count = 0;
        int[] index = new int[2];
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (count == 2) {
                    return false;
                }
                index[count++] = i;
            }
        }
        return count == 2 && s1.charAt(index[0]) == s2.charAt(index[1]) && s1.charAt(index[1]) == s2.charAt(index[0]);
    }
}
