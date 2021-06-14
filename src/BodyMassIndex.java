import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double h, w;
        Scanner s = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        h = s.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        w = s.nextDouble();
        if (h > 3 || w > 500 || h < 0 || w < 0)
        {
            System.out.println("Hatalı giriş!");
            return;
        }

        System.out.print("Vücut kitle indeksiniz: " + (w / (h * h)));
    }


}
