package javass;
import java.util.Scanner;
public class cinzodyagihesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dogumYili;
        System.out.print("Doğum Yılınızı Giriniz:     ");
        dogumYili = input.nextInt();
        int zodyag = dogumYili%12;
        switch (zodyag){
            case 0:
                System.out.println("Doğum Tarihi %12 = 0 ➜ Maymun");
                break;
            case 1:
                System.out.println("Doğum Tarihi %12 = 1 ➜ Horoz");
                break;
            case 2:
                System.out.println("Doğum Tarihi %12 = 2 ➜ Köpek");
                break;
            case 3:
                System.out.println("Doğum Tarihi %12 = 2 ➜ Domuz");
                break;
            case 4:
                System.out.println("Doğum Tarihi %12 = 4 ➜ Fare");
                break;
            case 5:
                System.out.println("Doğum Tarihi %12 = 5 ➜ Öküz");
                break;
            case 6:
                System.out.println("Doğum Tarihi %12 = 6 ➜ Kaplan");
                break;
            case 7:
                System.out.println("Doğum Tarihi %12 = 7 ➜ Tavşan ");
                break;
            case 8:
                System.out.println("Doğum Tarihi %12 = 8 ➜ Ejderha");
                break;
            case 9:
                System.out.println("Doğum Tarihi %12 = 9 ➜ Yılan");
                break;
            case 10:
                System.out.println("Doğum Tarihi %12 = 10 ➜ At");
                break;
            case 11:
                System.out.println("Doğum Tarihi %12 = 11 ➜ Koyun");
                break;
            default:
        }
    }
}
