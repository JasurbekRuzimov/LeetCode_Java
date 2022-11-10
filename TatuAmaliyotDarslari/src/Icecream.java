import java.util.Scanner;

public class Icecream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        boolean s=false;
        for (int i=0; i<=a; i+=1){
            for (int j=0; j<=a; j+=1){
                if (i*5+j*3==a) {
                    s=true;
                    break;
                }
            }
        }
        if (s==true){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
