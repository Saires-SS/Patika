package javass;
import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.0; ;
        int arkg, elkg, domkg, muzkg, patkg;
        System.out.print("Armut kaç kilo ?:");
        arkg = input.nextInt();
        armut *= arkg;
        System.out.print("Elma kaç kilo ?:");
        elkg = input.nextInt();
        elma *= elkg;
        System.out.print("Domates kaç kilo ?:");
        domkg = input.nextInt();
        domates *= domkg;
        System.out.print("Muz kaç kilo ?:");
        muzkg = input.nextInt();
        muz *= muzkg;
        System.out.print("Patlıcan kaç kilo ?:");
        patkg = input.nextInt();
        patlıcan *= patkg;
        Double toplamFiyat = armut + elma + domates + muz + patlıcan;
        System.out.print("Toplam:  "  + toplamFiyat);
    }
}
