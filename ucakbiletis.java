package javass;

import java.util.Scanner;

public class ucakbiletis {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int km;
            System.out.print("Kilometre giriniz:  ");
            km = input.nextInt();

            double KMbasi = 0.10;
            double NormalTutar = km * KMbasi;
            int yas;
            System.out.print("Yaşınızı giriniz:   ");
            yas = input.nextInt();
            System.out.println("Yolculuk tipi giriniz .:.");
            System.out.print("1- Gidiş \n2- Gidiş - Dönüş \n");
            int yolculukTipi;
            yolculukTipi = input.nextInt();
            if(km < 0 || yas < 0 || yolculukTipi < 1 || 2 < yolculukTipi){
                System.out.println("Hatali veri girdiniz.! ");
            }else{
                System.out.println("Normal Tutar:   " + NormalTutar);
                if( yas < 12){
                    double yasindirimi = NormalTutar / 2;
                    System.out.println("Yaş indirimi:   " + yasindirimi);
                    if(yolculukTipi == 1){
                        double toplamTutar = NormalTutar - yasindirimi;
                        System.out.println("Toplam Tutar =  " + toplamTutar );
                    }else{
                        double gidisdonus = (NormalTutar - yasindirimi) * 0.2;
                        double toplamTutar = (NormalTutar - yasindirimi) - gidisdonus;
                        System.out.println("Gidiş Dönüş Bilet İndirimi:     " + gidisdonus);
                        System.out.println("Toplam Tutar =  " + toplamTutar );
                    }
                }if(11 < yas){
                    if( yas < 25){
                        double yasindirimi = NormalTutar * 0.1;
                        System.out.println("Yaş indirimi:   " + yasindirimi);
                        if(yolculukTipi == 1){
                            double toplamTutar = NormalTutar - yasindirimi;
                            System.out.println("Toplam Tutar =  " + toplamTutar );
                        }else{
                            double gidisdonus = (NormalTutar - yasindirimi) * 0.2;
                            double toplamTutar = (NormalTutar - yasindirimi) - gidisdonus;
                            System.out.println("Gidiş Dönüş Bilet İndirimi:     " + gidisdonus);
                            System.out.println("Toplam Tutar =  " + toplamTutar );
                        }
                    }else{
                        if(65 < yas){
                            double yasindirimi = NormalTutar * 0.3;
                            System.out.println("Yaş İndirimi:   " + yasindirimi);
                            if(yolculukTipi == 1){
                                double toplamTutar = NormalTutar - yasindirimi;
                                System.out.println("Toplam Tutar =  " + toplamTutar );
                            }else{
                                double gidisdonus = (NormalTutar - yasindirimi) * 0.2;
                                double toplamTutar = (NormalTutar - yasindirimi) - gidisdonus;
                                System.out.println("Gidiş Dönüş Bilet İndirimi:     " + gidisdonus);
                                System.out.println("Toplam Tutar =  " + toplamTutar );
                            }
                        }else{
                            if(yolculukTipi == 1){
                                double toplamTutar = NormalTutar;
                                System.out.println("Toplam Tutar =  " + toplamTutar );
                            }else{
                                double gidisdonus = NormalTutar * 0.2;
                                double toplamTutar = NormalTutar - gidisdonus;
                                System.out.println("Gidiş Dönüş Bilet İndirimi:     " + gidisdonus);
                                System.out.println("Toplam Tutar =  " + toplamTutar );
                            }
                        }

                    }

                }
            }
    }
}


