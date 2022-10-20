package javass;
import java.util.Scanner;
public class dairealancevre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dilimAlan;
        double pi =3.14;
        int yaricap, aci;
        System.out.print("Yarıçap Giriniz:  ");
        yaricap = input.nextInt();
        System.out.print("Açı giriniz:   ");
        aci = input.nextInt();

        dilimAlan = (pi*(yaricap*yaricap)*aci)/360;
        System.out.print("Daire Diliminin Alanı:     " + dilimAlan);

    }
}
