package javass;
import java.util.Scanner;

public class artikYilHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("Yıl Giriniz:  " );
        yil = input.nextInt();
        int artik;
        artik = yil%4;
        if(artik == 0){
            System.out.println( yil +" artık yıldır !");
        }else{
            System.out.println( yil +" artık yıl değildir !");

        }
    }
}
