import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class ArkadasSayilar {
    // kendileri haric pozitif tam sayı bolenleri birbirine eşit olan sayılardır
    // bilinen en küçük örnek 220-284

    public static void main(String[] args){
        int sayi1, sayi2;
        int toplamSayi1 = 0;
        int toplamSayi2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Arkadas sayi olup olmadigi kontrol edilecek " +
                "sayilari giriniz: ");
        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();

        for (int i=1 ; i < sayi1; i++){
            if (sayi1 % i == 0){
                toplamSayi1 += i;
            }
        }

        for (int i =1; i < sayi2; i++){
            if (sayi2 % i == 0){
                toplamSayi2 += i;
            }
        }

        if (toplamSayi1 == sayi2 && toplamSayi2 == sayi1){
            System.out.println("Girilen iki sayi arkadas sayidir.");
        } else {
            System.out.println("Girilen sayilar arkadas sayi degildir.");
        }



    }
}
