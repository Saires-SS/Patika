package javass;
import java.util.Scanner;

public class usalanprogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, toplam = 1;
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("Sayının üssünü giriniz:    ");
        b = input.nextInt();
        for(int i = 1; i <= b; i++ ){
            toplam *= a;}
        System.out.print("Sonuç:  " + toplam );}}
