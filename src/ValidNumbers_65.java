public class ValidNumbers_65 {
    public static void main(String[] args) {
        System.out.println(isNumber("0"));
        System.out.println(isNumber(" 0.1 "));
        System.out.println(isNumber("abc"));
        System.out.println(isNumber("1 a"));
        System.out.println(isNumber("2e10"));
        System.out.println(isNumber(" -90e3   "));
        System.out.println(isNumber(" 1e"));
        System.out.println(isNumber("e3"));
        System.out.println(isNumber(" 6e-1"));
        System.out.println(isNumber(" 99e2.5 "));
        System.out.println(isNumber("53.5e93"));
        System.out.println(isNumber(" --6 "));
        System.out.println(isNumber("-+3"));
        System.out.println(isNumber("95a54e53"));
    }
    public static boolean isNumber(String s) {
        s = s.trim();
        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        boolean numberAfterE = true;
        for (int i = 0; i < s.length(); i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                numberSeen = true;
                numberAfterE = true;
            } else if (s.charAt(i) == '.') {
                if (eSeen || pointSeen) {
                    return false;
                }
                pointSeen = true;
            } else if (s.charAt(i) == 'e') {
                if (eSeen || !numberSeen) {
                    return false;
                }
                numberAfterE = false;
                eSeen = true;
            } else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                if (i != 0 && s.charAt(i - 1) != 'e') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return numberSeen && numberAfterE;
    }
}
