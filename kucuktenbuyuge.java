package javass;
import java.util.Scanner;
public class kucuktenbuyuge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p, r, s;
        System.out.println("Sayıları Giriniz....   ");
        p = input.nextDouble();
        r = input.nextDouble();
        s = input.nextDouble();
        if(p < r) {
            if (p < s) {
                if (r < s) {System.out.println(" Sıralama : : : " + p + " < " + r + " < " + s);
                } else {System.out.println(" Sıralama : : : " + p + " < " + s + " < " + r);
                }
            }
        }if(s < p){
            if(s < r){
                if(p < r){System.out.println(" Sıralama : : : " +  s +" < "+ p + " < "  + r);
                }else{System.out.println(" Sıralama : : : " +  s +" < "+ r +" < "+ p);
                }
            }
        }if(r < p) {
            if (r < s) {
                if (p < s) {System.out.println(" Sıralama : : : " + r + " < " + p + " < " + s);
                } else {System.out.println(" Sıralama : : : " + r + " < " + s + " < " + p);
                }
            }
        }else{System.out.println("En az iki tane eşit sayı girdiniz.");
            System.out.println("**********************************     TEKRARDAN ÇALIŞTIR AQQQQQ    ***************************.");
        }
    }
}
