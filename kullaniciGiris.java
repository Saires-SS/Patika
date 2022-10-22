package javass;
import java.util.Scanner;

public class kullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password, degistir;
        System.out.print("Kullanıcı Adını Giriniz:    ");
        username = input.nextLine();
        System.out.print("\nŞifrenizi Giriniz:    ");
        password = input.nextLine();
        if(username.equals("patika") && password.equals("sifre")){
            System.out.println("Başarıyla Giriş Yaptınız");
        }else {
            System.out.println("Giriş Yapılamadı Lütfen Tekrar Deneyiniz");
        }
        System.out.print("Yeni şifreyi giriniz:   ");
        degistir = input.nextLine();
        if(degistir.equals("sifre")){
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            System.out.print("Şifre Giriniz:   ");
            degistir = input.nextLine();

        }else{
                System.out.print("\nŞifre oluşturuldu       ");
        }


    }
}
