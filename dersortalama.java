package javass;
import java.util.Scanner;

public class dersortalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fiz, tur, kim, muz;
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
        int toplam = mat + fiz + tur + kim + muz;
        double ortalama;
        int i = 5;
        if(mat < 0 || 100 < mat){
            System.out.println("Ortalama Katılmadı (Matematik) ");

            toplam -= mat;
            i -= 1;
        }if(fiz < 0 || 100 < fiz){
            System.out.println("Ortalamaya Katılmadı (Fizik)");
            toplam -= fiz;
            i -= 1;
        }if(tur < 0 || 100 < tur){
            System.out.println("Ortalamaya Katılmadı (Türkçe)");
            toplam -= tur;
            i -= 1;
        }if(kim < 0 || 100 < kim){
            System.out.println("Ortalamaya Katılmadı (Kimya)");
            toplam -=kim;
            i-=1;
        }if(muz<0 || 100<muz){
            System.out.println("Ortalamaya Katılmadı (Müzik)");
            toplam -=muz;
            i-=1;
        }
        ortalama = toplam / i ;

        if(ortalama < 55){
            System.out.print("\nOrtalama : " + ortalama );
            System.out.println("Kaldınız.");
        }else{
            System.out.print("\nOrtalama : " + ortalama );

        }
    }
}
