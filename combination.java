package javass;
import java.util.Scanner;
public class combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, a, C;
        System.out.print(" n sayısını giriniz:   ");
        n = input.nextInt();
        System.out.print(" r sayısını giriniz:   ");
        r = input.nextInt();
        a = n -r;
        int totaln = 1, totalr = 1, totala = 1;
        for(int i = 1; i <= n; i++){
            totaln *= i;}
        for(int i = 1; i <= r; i++){
            totalr *= i;}
        for(int i = 1; i <= a; i++){
            totala *= i;}
        C = totaln / (totalr * (totala));
        System.out.println("N’in r’li kombinasyonu C(n,r)  :"  + C);
    }
}
