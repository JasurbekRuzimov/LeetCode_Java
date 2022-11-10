import java.util.Scanner;

public class ConsonantLetters {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Biror so'z kiriting");
        str = scanner.nextLine();

        System.out.println( ConsonantLetters(str));
    }
       public static String ConsonantLetters(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U') {
                result += str.charAt(i);
            }
        }
        return result;
    }

}
