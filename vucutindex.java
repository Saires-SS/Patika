package javass;
import java.util.Scanner;

public class vucutindex {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double boy, kg, index;
    System.out.print("Lütfen boyunuzu (metre cinsinde (1,80 gibi)) giriniz :  ");
    boy = input.nextDouble();
    System.out.print("Lütfen kilonuzu giriniz :   ");
    kg = input.nextDouble();
    index = kg / (boy*boy);
    System.out.print("Vücut Kitle İndeksiniz : " + index);

    }
}
