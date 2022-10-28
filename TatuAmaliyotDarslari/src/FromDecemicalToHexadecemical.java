import java.util.Scanner;

public class FromDecemicalToHexadecemical {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Biror son kiriting");
        n = scanner.nextInt();
        System.out.println(" O'nlikka o'tgandagi holat  ->  "+Integer.toHexString(n));
        System.out.println(" O'n oltilikka o'tgandagi holat ->  " +Integer.parseInt(String.valueOf(n), 16));

    }
}
