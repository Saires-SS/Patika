package javass;
import java.util.Scanner;
public class kdv {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat, kdv;
        System.out.print("Maaş giriniz:      ");
        fiyat = input.nextDouble();
        double kdvtutari;
        double toplamFiyat;
        if(0< fiyat && fiyat < 1000){
            kdv = 0.18;
            kdvtutari = fiyat * kdv;
            toplamFiyat = kdvtutari + fiyat;
            System.out.println("KDV oranı:   " + kdv );
            System.out.println("KDV tutarı:   " + kdvtutari );
            System.out.println("Toplam KDV'li fiyatı:   " + toplamFiyat );
        }
        else{
            kdv = 0.08;
            kdvtutari = fiyat * kdv;
            toplamFiyat = kdvtutari + fiyat;
            System.out.println("KDV oranı:   " + kdv );
            System.out.println("KDV tutarı:   " + kdvtutari );
            System.out.println("Toplam KDV'li fiyatı:   " + toplamFiyat );
        }





    }
}