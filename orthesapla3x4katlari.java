package javass;
import java.util.Scanner;

public class orthesapla3x4katlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, a;
        System.out.print("Bir sayı giriniz:    ");
        a = input.nextInt();
        int x3, x4 ,toplam=0, toplam3=0, toplam4=0;
        double ort;
        int count = 0;
        for(i=0; i<=a; i++){
            x3 = i%3;
            x4 = i%4;
            if(x3 == 0){
                toplam3 = i + toplam3;
                count +=1;
            }
            if(x4 == 0){
                toplam4 += i;
                count +=1;
            }
        }
        System.out.println("3'e bölünen sayıların toplamı:  " + toplam3);
        System.out.println("4'e bölünen sayıların toplamı:  " + toplam4);
        toplam = toplam3 + toplam4;
        ort = toplam / count;
        System.out.println("Sayıların toplamı:  " + toplam + ", sayıların ortalaması:  "+ ort);

    }
}
