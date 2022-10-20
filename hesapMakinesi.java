package javass;
import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;
        System.out.print("Birinci sayıyı giriniz:   ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz:   ");
        n2 = input.nextInt();
        int a;
        System.out.println("Yapılacak işlemi seçiniz;");
        System.out.print("1- Toplama \n2- Çıkarma\n3- Çarpma\n4-  Bölme\n");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.print(n1 + " + " + n2  + " = " + (n1 + n2));
                break;

            case 2:
                System.out.print(n1 + " - " + n2 +" = " + (n1 - n2));
                break;

            case 3:
                System.out.print(n1 + " * " + n2 +" = " + (n1 * n2));
                break;
            case 4: System.out.print(n1 + " / " + n2 +" = " + (n1 / n2));
            break;
            default:
        }





    }
}
