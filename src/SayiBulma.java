import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
public class SayiBulma {
    // girilen sayı sayılar dizisinde var mı
    public static void main(String[] args){
        int[] sayilar = {12,36,58,47,94,15,120,56,93};
        int aranacakSayi ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizide aranacak sayiyi giriniz: ");
        aranacakSayi = scanner.nextInt();

        boolean varMi = false;

        for (int sayi : sayilar){
            if ( aranacakSayi == sayi) {
                varMi = true;
            }
        }

        if (varMi) {
            System.out.println("Giridiginiz sayi dizide yer almakta.");
        } else {
            System.out.println("Girdiginiz sayi dizide yer almamakta.");
        }

    }


}
