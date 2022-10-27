package javass;
import java.util.Scanner;
public class mukemmelsayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:   ");
        int n, toplam = 0;
        n = input.nextInt();
        for (int i = 1; i < n;){
            if(n%i == 0){
                toplam += i;
                i++; } else{
                i++;
            }}
        if (toplam == n){
                System.out.print(n + " Mükemmel Sayıdır   ");}
        else{
                System.out.print(n + " Mükemmel Sayı Değildir.   ");
            }}}
