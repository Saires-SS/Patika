package javass;
import java.util.Scanner;
public class denemeke {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mat, fiz, tur, kim, muz, tar;
        System.out.print("Matematik notunu giriniz:  ");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz giriniz:  ");
        fiz = input.nextInt();

        System.out.print("Türkçe notunu giriniz:  ");
        tur = input.nextInt();

        System.out.print("Kimya notunu giriniz:  ");
        kim = input.nextInt();

        System.out.print("Müzik notunu giriniz:  ");
        muz = input.nextInt();

        System.out.print("Tarih notunu giriniz:  ");
        tar = input.nextInt();

        int toplam = mat + fiz + tur + kim + muz + tar;
        double ortalama = toplam / 6;
        System.out.println( "Ortalama:    " + ortalama);

        boolean kosul = ortalama >= 60;
        String gectiMi = kosul ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(gectiMi);

    }
}
