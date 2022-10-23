package javass;
import java.util.Scanner;

public class sicakligagoreactivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double heat;
        System.out.print("Sıcaklık Giriniz:     ");
        heat = input.nextDouble();
        System.out.println("Girilen Sıcaklık :   "  +  heat);


        if(heat < 5){
            System.out.println("Kayak yapabilirsiniz...");
        }if (4 < heat && heat < 16 ){
            System.out.println("Sinemaya Gidebilirsiniz...");
        }if(15 < heat && heat < 26){
            System.out.println("Piknik Yapabilirsiniz...");
        }if(25 < heat){
            System.out.println("Yüzmeye Gidebilirsiniz...");
        }

    }
}
