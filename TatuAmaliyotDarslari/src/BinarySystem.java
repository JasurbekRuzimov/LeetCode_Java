import java.util.Scanner;

public class BinarySystem {


        public static void main(String[] args) {
            int n;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Biror son kiriting");
            n = scanner.nextInt();
            String binary = Integer.toBinaryString(n);
            System.out.println("  " + n + " Ikkilik sanoq sistemasiga o'tganda  🔜  " + binary + "   shunday ko'rinishda bo'ladi");


        }

    }


