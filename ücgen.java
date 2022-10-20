package javass;
import java.util.Scanner;

public class ücgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("İlk kenar:    ");
        a = input.nextInt();

        System.out.print("İkinci kenar:    ");
        b = input.nextInt();

        System.out.print("Üçüncü kenar:    ");
        c = input.nextInt();
        double  u;
        u = (a + b + c)/2;
        // cevre = 2u;
        double Alan;
        Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı:  " + Alan);
    }
}
