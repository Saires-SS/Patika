package javass;
import java.util.Scanner;

public class burcyazdir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;
        System.out.println("Doğum ayınızı giriniz:    ");
        month = input.nextInt();
        System.out.println("Doğum gününüzü giriniz:   ");
        day = input.nextInt();
        if(month > 12 || 0 > month){
            System.out.println("Yanlış ay girdiniz....");

        }else if (day < 1 || day > 30) {
            System.out.println("Yanlış gün girdiniz....");


        }else
        {
            if (month == 1){
                if(day < 22){
                        System.out.println("Oğlak Burcu : 22 Aralık - 21 Ocak");

                    }else{
                        System.out.println("Kova Burcu : 22 Ocak - 19 Şubat");
                    }
            }
            if(month == 2){
                if(day < 20){
                    System.out.println("Kova Burcu : 22 Ocak - 19 Şubat");

                }else if(day <= 29){
                    System.out.println("Balık Burcu : 20 Şubat - 20 Mart");
                }else{
                    System.out.println("Şubat ayı 29 gündür....");
                }
            }
            if(month == 3){
                if(day < 21){
                    System.out.println("Balık Burcu : 20 Şubat - 20 Mart");
                }else{
                    System.out.println("Koç Burcu : 21 Mart - 20 Nisan");
                }
            }if(month == 4){
                if(day < 21){
                    System.out.println("Koç Burcu : 21 Mart - 20 Nisan");

                }else{
                    System.out.println("Boğa Burcu : 21 Nisan - 21 Mayıs");
                }
        }if (month == 5){
                if(day < 22){
                    System.out.println("Boğa Burcu : 21 Nisan - 21 Mayıs");
                }else {
                    System.out.println("İkizler Burcu : 22 Mayıs - 22 Haziran");
                }
        }if(month == 6){
                if(day < 23){
                    System.out.println("İkizler Burcu : 22 Mayıs - 22 Haziran");
                }else{
                    System.out.println("Yengeç Burcu : 23 Haziran - 22 Temmuz");
                }
        }if(month == 7){
                if(day < 23){
                    System.out.println("Yengeç Burcu : 23 Haziran - 22 Temmuz");
                }else{
                    System.out.println("Aslan Burcu : 23 Temmuz - 22 Ağustos");
                }
        }if(month == 8){
                if(day < 23){
                    System.out.println("Aslan Burcu : 23 Temmuz - 22 Ağustos");
                }else{
                    System.out.println("Başak Burcu : 23 Ağustos - 22 Eylül");
                }
        }if(month == 9){
                if(day < 23){
                    System.out.println("Başak Burcu : 23 Ağustos - 22 Eylül");
                }else{
                    System.out.println("Terazi Burcu : 23 Eylül - 22 Ekim");
                }
        }if(month == 10){
                if(day < 22){
                    System.out.println("Terazi Burcu : 23 Eylül - 22 Ekim");
                }else{
                    System.out.println("Akrep Burcu : 23 Ekim - 21 Kasım");
                }
        }if(month == 11){
                if(day < 22){
                    System.out.println("Akrep Burcu : 23 Ekim - 21 Kasım");
                }else{
                    System.out.println("Yay Burcu : 22 Kasım - 21 Aralık");
                }
        }if(month == 12){
                if(day < 22){
                    System.out.println("Yay Burcu : 22 Kasım - 21 Aralık");
                }else{
                    System.out.println("Oğlak Burcu : 22 Aralık - 21 Ocak");
                }
        }
        }
    }
}
